package com.gs.redis;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRedisClientSingle {


    public RedisClientSingle redisClientSingle = null;

    @Before
    public void before() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-redis.xml");
        redisClientSingle = applicationContext.getBean(RedisClientSingle.class);
    }


    @Test
    public void TestSetGet(){
        redisClientSingle.set("name","leaf");
        System.out.println("========name: "+redisClientSingle.get("name"));
    }

}
