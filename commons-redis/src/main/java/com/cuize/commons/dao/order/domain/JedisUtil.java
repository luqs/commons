package com.cuize.commons.dao.order.domain;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Java操作Redis基础工具类
 * @author JackieLan
 *
 */
public class JedisUtil {

	private static final Logger LOG =  LoggerFactory.getLogger(JedisUtil.class);

	/**
	 * 获取数据
	 * @param key
	 * @return
	 */
	public static String get(String key) {
		String value = null;
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			value = jedis.get(key);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
		return value;
	}

	/**
	 * 关闭连接
	 * @param jedis
	 */
	public static void close(Jedis jedis) {
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedisPool.returnResource(jedis);
		} catch (Exception e) {
			if (jedis.isConnected()) {
				jedis.quit();
				jedis.disconnect();
			}
		}
	}

	/**
	 * 获取数据
	 * 
	 * @param key
	 * @return
	 */
	public static byte[] get(byte[] key) {
		byte[] value = null;
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			value = jedis.get(key);
		} catch (Exception e) {
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
		return value;
	}

	public static void set(byte[] key, byte[] value) {
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			jedis.set(key, value);
		} catch (Exception e) {
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
	}

	public static void set(byte[] key, byte[] value, int time) {
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			jedis.set(key, value);
			jedis.expire(key, time);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
	}

	public static void hset(byte[] key, byte[] field, byte[] value) {
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			jedis.hset(key, field, value);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
	}

	public static void hset(String key, String field, String value) {
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			jedis.hset(key, field, value);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
	}

	/**
	 * 获取数据
	 * 
	 * @param key
	 * @return
	 */
	public static String hget(String key, String field) {

		String value = null;
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			value = jedis.hget(key, field);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}

		return value;
	}

	/**
	 * 获取数据
	 * 
	 * @param key
	 * @return
	 */
	public static byte[] hget(byte[] key, byte[] field) {

		byte[] value = null;
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			value = jedis.hget(key, field);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}

		return value;
	}

	public static void hdel(byte[] key, byte[] field) {

		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			jedis.hdel(key, field);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
	}

	/**
	 * 插入Redis队列头部
	 * @param byte[] key reids键名
	 * @param byte[] value 键值
	 */
	public static void lpush(byte[] key, byte[] value) {
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			jedis.lpush(key, value);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);

		}
	}

	/**
	 * 插入Redis队列尾部
	 * @param byte[] key reids键名
	 * @param byte[] value 键值
	 */
	public static void rpush(byte[] key, byte[] value) {
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			jedis.rpush(key, value);

		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
	}
	
	/**
	 * 插入Redis队列尾部
	 * @param key reids键名
	 * @param value 键值
	 */
	public static void rpush(String key, String value) {
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			jedis.rpush(key, value);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
	}

	/**
	 * 将列表 source 中的最后一个元素(尾元素)弹出，并返回给客户端
	 * @param key reids键名
	 * @param value 键值
	 */
	public static void rpoplpush(byte[] key, byte[] destination) {
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			jedis.rpoplpush(key, destination);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
	}

	/**
	 * 获取队列数据
	 * @param byte[] key 键名
	 * @return
	 */
	public static List lpopList(byte[] key) {

		List list = null;
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			list = jedis.lrange(key, 0, -1);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
		return list;
	}

	/**
	 * 获取队列倒数第一个数据
	 * @param byte[] key 键名
	 * @return
	 */
	public static byte[] rpop(byte[] key) {

		byte[] bytes = null;
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			bytes = jedis.rpop(key);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
		return bytes;
	}
	
	/** 
	 * 获取队列倒数第一个数据
	 * @param key 键名
	 * @return
	 */
	public static String rpop(String key) {
		String bytes = null;
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			bytes = jedis.rpop(key);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
		return bytes;
	}

	/** 
	 * 获取队列第一个数据
	 * @param byte[] key 键名
	 * @return
	 */
	public static String lpop(String key) {
		String bytes = null;
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			bytes = jedis.lpop(key);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
		return bytes;
	}
	
	public static void hmset(Object key, Map hash) {
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			jedis.hmset(key.toString(), hash);
		} catch (Exception e) {
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);

		}
	}

	public static void hmset(Object key, Map hash, int time) {
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			jedis.hmset(key.toString(), hash);
			jedis.expire(key.toString(), time);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);

		}
	}

	public static List hmget(Object key, String... fields) {
		List result = null;
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();

			jedis = jedisPool.getResource();
			result = jedis.hmget(key.toString(), fields);

		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);

		}
		return result;
	}

	public static Set hkeys(String key) {
		Set result = null;
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			result = jedis.hkeys(key);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
		return result;
	}

	/**
	 * 获取队列指定区间的元素
	 * @param key
	 * @param from 从0开始
	 * @param to 最后一个为-1
	 * @return
	 */
	public static List lrange(byte[] key, int from, int to) {
		List result = null;
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			result = jedis.lrange(key, from, to);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
		return result;
	}
	
	/**
	 * 获取队列指定区间的元素
	 * @param key
	 * @param from 从0开始
	 * @param to 最后一个为-1
	 * @return
	 */
	public static List lrange(String key, int from, int to){
		List result = null;
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			result = jedis.lrange(key, from, to);

		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
		return result;
	}
	
	public static Map hgetAll(byte[] key) {
		Map result = null;
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			result = jedis.hgetAll(key);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
		return result;
	}

	public static void del(byte[] key) {

		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			jedis.del(key);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
	}

	public static long llen(byte[] key) {

		long len = 0;
		Jedis jedis = null;
		JedisPool jedisPool = null;
		try {
			jedisPool = RedisPool.getJedisPool();
			jedis = jedisPool.getResource();
			jedis.llen(key);
		} catch (Exception e) {
			//释放redis对象
			if (jedisPool != null) {
                jedisPool.returnBrokenResource(jedis);
            }
			LOG.error("Jedis工具类异常", e);
		} finally {
			//返还到连接池
			close(jedis);
		}
		return len;
	}

}