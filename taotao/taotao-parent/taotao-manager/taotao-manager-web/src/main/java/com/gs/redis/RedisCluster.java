package com.gs.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisCluster;

@Component
public class RedisCluster implements RedisClient {

    @Autowired
    private JedisCluster jedisCluster;

    public String set(String key, String value) {
        return jedisCluster.set(key, value);
    }

    public String get(String key) {
        return jedisCluster.get(key);
    }

    public Long hset(String key, String item, String value) {
        return jedisCluster.hset(key, item, value);
    }

    public String hget(String key, String item) {
        return jedisCluster.hget(key, item);
    }

    public Long expire(String key, int second) {
        return jedisCluster.expire(key, second);
    }

    public Long ttl(String key) {
        return jedisCluster.ttl(key);
    }
}
