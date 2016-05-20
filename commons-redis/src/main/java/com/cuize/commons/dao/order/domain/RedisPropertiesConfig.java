package com.cuize.commons.dao.order.domain;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * redis配置工具类
 * @author JackieLan
 *
 */
public class RedisPropertiesConfig {
	
	private static final Logger LOG = LoggerFactory
			.getLogger(RedisPropertiesConfig.class);

	private static Properties prop = new Properties();
	
    // 初始化配置
    static {
		String fileName = "/config/config.properties";
		InputStream in = RedisPropertiesConfig.class.getResourceAsStream(fileName);
		try {
			prop.load(in);
			in.close();
		} catch (IOException e) {
			LOG.error("加载properties文件异常", e);
		} 
    	
    }
   
	public static String getRedisServer() {
		return (String) prop.get("redis.host");
	}

	public static int getRedisPort() {
		return (int) prop.get("redis.port");
	}

	public static String getRedisPassword() {
		return (String) prop.get("redis.password");
	}

	public static int getRedisTimeOut() {
		return (int) prop.get("redis.timeout");
	}

	public static int getRedisPoolMaxActive() {
		return (int) prop.get("redis.pool.maxActive");
	}

	public static int getRedisPoolMaxIdle() {
		return (int) prop.get("redis.pool.maxIdle");
	}

	public static int getRedisPoolMaxWait() {
		return (int) prop.get("redis.pool.maxWait");
	}

	public static boolean isRedisPoolTestOnBorrow() {
		return (boolean) prop.get("redis.pool.testOnBorrow");
	}
}
