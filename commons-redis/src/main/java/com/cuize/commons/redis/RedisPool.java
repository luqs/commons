package com.cuize.commons.redis;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.config.GlobleConfig;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Redis连接池
 * @author JackieLan
 *
 */
public class RedisPool {
	
	private static final Logger LOG = LoggerFactory.getLogger(RedisPool.class);

	private RedisPool() {
	}

	private static volatile JedisPool jedisPool;

	
	/**
	 * 线程安全实现的redis连接池
	 * @return
	 * @throws Exception
	 *             注意，直接使用这个方法必须关闭redis连接，关闭的方法参见RedisManager的getValueForObject(
	 *             String key)或setValueForObject(String key, Object object, int
	 *             export)的操作
	 * 
	 */
	public static JedisPool getJedisPool() {
		/*
		 * 如下方式初始化单例对象的必须保证才能保证单例 由于创建JedisPool实例需要一个过程，在创建期间jedisPool一直为null
		 * 如果程序启动之后有两个请求同时获取redis连接则可能触发两次创建redis连接池导致连接创建过多
		 * 修改为使用内部静态态类实现单例模式，参见RedisPoolInner
		 */
		if (jedisPool == null) {
			synchronized (RedisPool.class) {
				if (jedisPool == null) {
					LOG.info("创建jedis连接池开始");
					String serverIp = GlobleConfig.getRedisServer();
					int port = GlobleConfig.getRedisPort();
					String password = GlobleConfig.getRedisPassword();
					int maxActive = GlobleConfig.getRedisPoolMaxActive();
					int maxIdle = GlobleConfig.getRedisPoolMaxIdle();
					int maxWait = GlobleConfig.getRedisPoolMaxWait();
					boolean testOnBorrow = GlobleConfig.isRedisPoolTestOnBorrow();
					int timeout = GlobleConfig.getRedisTimeOut();

					JedisPoolConfig config = new JedisPoolConfig();
					config.setMaxActive(maxActive);
					config.setMaxIdle(maxIdle);
					config.setMaxWait(maxWait);
					config.setTestOnBorrow(testOnBorrow);
					JedisPool jedisPoolJubu = new JedisPool(config, serverIp, port, timeout, password);
					jedisPool = jedisPoolJubu;
					LOG.info("创建jedis连接池ok");
				}
			}
		}
		if (jedisPool == null) {
			throw new RuntimeException("redis连接池创建失败！");
		}
		return jedisPool;
	}
}
