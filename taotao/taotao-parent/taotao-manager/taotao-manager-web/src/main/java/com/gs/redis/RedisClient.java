package com.gs.redis;

/**
 * 将jedis中的方法进行封装
 */
public interface RedisClient {

    /**
     * set 方法
     * @param key
     * @param value
     * @return
     */
    public String set(String key, String value);


    /**
     * get
     * @param key
     * @return
     */
    public String get(String key);


    /**
     * hashset 散列，据说比set省内存，但是更耗cpu
     * @param key
     * @param item
     * @param value
     * @return
     */
    public Long hset(String key, String item, String value);


    /**
     * hashget
     * @param key
     * @param item
     * @return
     */
    public String hget(String key, String item);


    /**
     * 设置过期时间
     * @param key
     * @param second
     * @return
     */
    public Long expire(String key, int second);


    /**
     * 查看剩余时间
     * @param key
     * @return
     */
    public Long ttl(String key);




}
