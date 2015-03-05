package com.awesome.pro.redis;

import com.awesome.pro.redis.client.AcquireRedisConnection;
import com.awesome.pro.redis.client.RedisClient;

/**
 * Created by sankeerth.reddy on 05/03/15.
 */
public class TestClient {

  public static void main(String[] args) {

    RedisClient redisClient = new AcquireRedisConnection().acquireResource();
    redisClient.storeData("key2", "value2");
    System.out.println(redisClient.getData("key2"));

    redisClient.storeData("key2", "value4");
    System.out.println(redisClient.getData("key2"));


  }
  
  

}
