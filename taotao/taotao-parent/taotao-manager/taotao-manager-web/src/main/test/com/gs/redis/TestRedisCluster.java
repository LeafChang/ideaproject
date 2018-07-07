package com.gs.redis;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRedisCluster {


    public RedisCluster redisCluster= null;

    @Before
    public void before() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-redis.xml");
        redisCluster = applicationContext.getBean(RedisCluster.class);
    }


    @Test
    public void TestSetGet(){
        redisCluster.set("age","21");
        System.out.println("========age: "+redisCluster.get("age"));
    }

}
