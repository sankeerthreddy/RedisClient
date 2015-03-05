package com.awesome.pro.redis.client;

import com.awesome.pro.redis.references.RedisConfigReferences;

import redis.clients.jedis.Jedis;

/**
 * Specifies how to acquire a new Redis client connection.
 * @author sankeerth.reddy
 */
public class AcquireRedisConnection {

	// Constructor.
	public AcquireRedisConnection() { }

	/* (non-Javadoc)
	 * @see com.awesome.pro.pool.AcquireResource#acquireResource()
	 */
	public static RedisClient acquireResource() {
		return new RedisClient(new Jedis(
				RedisConfigReferences.REDIS_HOST,
				RedisConfigReferences.REDIS_PORT));
	}

}
