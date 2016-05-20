/*
 * Copyright (C) 2006-2013 Tuniu.com. All rights reserved
 * Author:zhaiweisen
 * Date:2013-05-23
 * Description:redis manager
 */
package com.cuize.commons.redis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * Redis管理类
 * @author JackieLan
 *
 */
@Component
public class RedisManager {

	private static final Logger LOG = LoggerFactory.getLogger(RedisManager.class);
	
    @Autowired
    private RedisTemplate<Serializable, Serializable> template;

    /**
     * add key-value in redis
     * 
     * @param key
     *            key
     * @param value
     *            value
     */
    public void setForValue(final Serializable key, final Serializable value) {
        template.opsForValue().set(key, value);
    }

    /**
     * add key-value in redis
     * 
     * @param key
     * @param value
     * @param timeout
     * @param unit
     */
    public void setForValue(final Serializable key, final Serializable value, long timeout, TimeUnit unit) {
        template.opsForValue().set(key, value, timeout, unit);
    }

    /**
     * add key-value in redis
     * 
     * @param m
     */
    public void setForValues(Map<? extends Serializable, ? extends Serializable> m) {
        template.opsForValue().multiSet(m);
    }

    /**
     * add key-value in redis
     * 
     * @param m
     * @param timeout
     * @param unit
     */
    public void setForValues(Map<? extends Serializable, ? extends Serializable> m, long timeout, TimeUnit unit) {
        for (Serializable key : m.keySet()) {
            template.opsForValue().set(key, m.get(key), timeout, unit);
        }
    }

    /**
     * get value from redis
     * 
     * @param key
     *            key
     * @param cls
     *            class type
     * @return object
     */
    public <T> T getForValue(final Serializable key, Class<T> cls) {
        Serializable obj = template.opsForValue().get(key);

        if (obj != null) {
            return cls.cast(obj);
        } else {
            return null;
        }

    }

    /**
     * get values from redis
     * 
     * @param keys
     * @param cls
     * @return
     */
    public <T> List<T> getForValues(final Collection<Serializable> keys, Class<T> cls) {
        List<Serializable> obj = template.opsForValue().multiGet(keys);
        List<T> result = new ArrayList<T>();
        if (null != obj) {
            for (Serializable s : obj) {
                if (null != s && !"null".equals(s)) {
                    result.add(cls.cast(s));
                }
            }
            return result;
        } else {
            return null;
        }

    }

    @SuppressWarnings("unchecked")
    public <T> List<T> getForValueList(final Collection<Serializable> keys, Class<T> cls) {
        try {
            List<Serializable> tmpList = template.opsForValue().multiGet(keys);
            List<Serializable> result = new ArrayList<Serializable>();
            for (Serializable serializable : tmpList) {// filter all null object
                if (null != serializable)
                    result.add(serializable);
            }
            return (List<T>) result;
        } catch (Exception e) {
            return new ArrayList<T>();
        }
    }

    public void setForValueList(final Map<Serializable, Serializable> map, long timeout, TimeUnit unit) {
        try {
            for (Entry<Serializable, Serializable> entry : map.entrySet()) {
                template.opsForValue().set(entry.getKey(), entry.getValue(), timeout, unit);
            }
        } catch (Exception e) {

        }
    }

    @SuppressWarnings("unchecked")
    public <K, V> Map<K, V> getForValueMap(final Serializable key) {
        Map<?, ?> obj = template.opsForHash().entries(key);
        try {
            return (Map<K, V>) obj;
        } catch (Exception e) {
            return new HashMap<K, V>();
        }
    }

    public <K, V> void setForValueMap(final Serializable key, Map<K, V> map, long timeout, TimeUnit unit) {
        try {
            template.multi();
            template.opsForHash().putAll(key, map);
            template.expire(key, timeout, unit);
            template.exec();
        } catch (Exception e) {
            template.discard();
        }
    }

    protected RedisSerializer<String> getRedisSerializer() {
        return template.getStringSerializer();
    }

    public boolean setForValueByPipeline(final List<Map<Object, Object>> list) {
        Assert.notEmpty(list);

        boolean result = template.execute(new RedisCallback<Boolean>() {
            public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
                RedisSerializer<String> serializer = getRedisSerializer();
                for (Map<Object, Object> map : list) {
                    byte[] key = serializer.serialize((String) map.get("key"));
                    byte[] name = serializer.serialize("");
                    connection.setEx(key, 3600 * 24 * 60, name);
                }
                return true;
            }
        }, false, true);
        return result;
    }

    public boolean setForValueByPipeline(final List<Map<Object, Object>> list, final int expire) {
        Assert.notEmpty(list);

        boolean result = template.execute(new RedisCallback<Boolean>() {
            public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
                RedisSerializer<String> serializer = getRedisSerializer();
                for (Map<Object, Object> map : list) {
                    String keyStr = (String) map.get("key");// yuwei&23728&K8456&NUH&RBH&7&20151004
                    byte[] key = serializer.serialize(keyStr);
                    byte[] name = serializer.serialize("");
                    connection.setEx(key, expire, name);
                    // 设置余位新鲜度，不区分供应商id
                    // yuwei&K8456&NUH&RBH&7&20151004
                    key = serializer.serialize(keyStr.replace(keyStr.substring(5, keyStr.indexOf("&", 6)), ""));

                    connection.setEx(key, expire, name);
                }
                return true;
            }
        }, false, true);
        return result;
    }

    public boolean queryOrUpdate(final String key, final long timeout) {
        boolean result = template.execute(new RedisCallback<Boolean>() {
            @Override
            public Boolean doInRedis(RedisConnection connection) {
                boolean result = false;
                try {
                    connection.watch(key.getBytes());
                    byte[] value = connection.get(key.getBytes());
                    if (null == value || "nouse".getBytes().equals(value)) {
                        connection.multi();
                        connection.setEx(key.getBytes(), timeout, "doing".getBytes());
                        List<Object> execResultList = connection.exec();
                        if (null == execResultList || 0 == execResultList.size() || null == execResultList.get(0)
                                || !"OK".equals(execResultList.get(0)))
                            result = false;
                        else
                            result = true;
                    } else {
                        connection.unwatch();
                        result = false;
                    }
                } catch (Exception e) {
                	LOG.error("RedisManager queryOrUpdate异常", e);
                    result = false;
                } finally {
                    connection.discard();
                }
                return result;
            }
        });
        return result;
    }

    @SuppressWarnings("unchecked")
    public <T> List<T> getForValueListAll(final Collection<Serializable> keys, Class<T> cls) {
        try {
            List<Serializable> tmpList = template.opsForValue().multiGet(keys);
            List<Serializable> result = new ArrayList<Serializable>();
            for (Serializable serializable : tmpList) {
                result.add(serializable);
            }
            return (List<T>) result;
        } catch (Exception e) {
            return new ArrayList<T>();
        }
    }

    /**
     * 批量更新发车时间
     * 
     * @param list
     * @param expire
     * @return
     */
    public boolean updateStartTime(final Map<String, String> list, final int expire) {
        boolean result = template.execute(new RedisCallback<Boolean>() {
            public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
                RedisSerializer<String> serializer = getRedisSerializer();
                for (Entry<String, String> entry : list.entrySet()) {
                    byte[] key = serializer.serialize(entry.getKey());
                    byte[] value = serializer.serialize(entry.getValue());
                    connection.setEx(key, expire, value);
                }
                return true;
            }
        }, false, true);
        return result;
    }

    /**
     * delete key-value in redis
     * 
     * @param key
     */
    public void deleteForKey(String key) {
        template.delete(key);
    }

    public void saveForList(Serializable key, Serializable value) {
        template.opsForList().leftPush(key, value);
    }

    public <T> T popFromList(final Serializable key, Class<T> cls) {
        Serializable obj = template.opsForList().leftPop(key);

        if (obj != null) {
            return cls.cast(obj);
        } else {
            return null;
        }
    }
    
	/**
	 * 获取队列指定区间的元素
	 * @param key
	 * @param from 从0开始
	 * @param to 最后一个为-1
	 * @return
	 */
	public List<String> lrange(String key, int from, int to){
		List<String> result = new ArrayList<String>();
		RedisConnection conn = null;
		try {
			conn = template.getConnectionFactory().getConnection();
			RedisSerializer<String> serializer = getRedisSerializer();
			List<byte[]> resultList = conn.lRange(serializer.serialize(key), from, to);
			if (resultList != null && !resultList.isEmpty()) {
				for (byte[] b : resultList) {
					result.add(serializer.deserialize(b));
				}
			}
		} catch (Exception e) {
			LOG.error("RedisManager.lrange异常", e);
		} finally {
			if (!conn.isClosed()) {
				conn.close();
			}
		}
		return result;
	}
	
	
	/**
	 * 插入Redis队列尾部
	 * @param key reids键名
	 * @param value 键值
	 */
	public boolean rpush(final String key, final String value) {
		boolean result = template.execute(new RedisCallback<Boolean>() {
			 @Override
	         public Boolean doInRedis(RedisConnection connection) {
				 RedisSerializer<String> serializer = getRedisSerializer();
				 byte[] keyBs = serializer.serialize(key);
                 byte[] valueBs = serializer.serialize(value);
				 
                 connection.rPush(keyBs, valueBs);
				 return true;
			 }
		});
		
		return result;
	}
	
	/** 
	 * 获取队列第一个数据
	 * @param key 键名
	 * @return
	 */
	public String lpop(String key) {
		String value = null;
		RedisConnection conn = null;
		try {
			conn = template.getConnectionFactory().getConnection();
			RedisSerializer<String> serializer = getRedisSerializer();
			byte[] valueBs = conn.lPop(serializer.serialize(key));
			if (valueBs != null && valueBs.length > 0) {
				value = serializer.deserialize(valueBs);
			}
		} catch (Exception e) {
			LOG.error("RedisManager.lpop异常", e);
		} finally {
			if (!conn.isClosed()) {
				conn.close();
			}
		}
		return value;
	}
}
