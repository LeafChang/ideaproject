package com.gs.redis;

import org.junit.Test;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class TestRedis {

    private final String REDIS_HOST = "192.168.1.102";

    @Test
    public void testJedisCluster() throws Exception {
        //创建一个JedisCluster对象
        Set<HostAndPort> nodes = new HashSet<HostAndPort>();
        nodes.add(new HostAndPort(REDIS_HOST, 7001));
        nodes.add(new HostAndPort(REDIS_HOST, 7002));
        nodes.add(new HostAndPort(REDIS_HOST, 7003));
        nodes.add(new HostAndPort(REDIS_HOST, 7004));
        nodes.add(new HostAndPort(REDIS_HOST, 7005));
        nodes.add(new HostAndPort(REDIS_HOST, 7006));
        //在nodes中指定每个节点的地址
        //jedisCluster在系统中是单例的。
        JedisCluster jedisCluster = new JedisCluster(nodes);
        jedisCluster.set("name", "zhangsan");
        jedisCluster.set("value", "100");
        String name = jedisCluster.get("name");
        String value = jedisCluster.get("value");
        System.out.println(name);
        System.out.println(value);
        //系统关闭时关闭jedisCluster
        jedisCluster.close();
    }

    @Test
    public void testDate() throws  Exception{

        String pattern = "yyyy-MM-dd HH:mm:ss";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        String dayPattern = "yyyy-MM-dd";

        SimpleDateFormat daySdf = new SimpleDateFormat(dayPattern);

        Date requestDate = sdf.parse("2018-04-07 19:20:00 ");

        Date dealDate = new Date();

        //int days = (int) ((dealDate.getTime() - requestDate.getTime()) / (24 * 60 * 60 * 1000)) + 1;
        Calendar begCalendar = Calendar.getInstance();
        Calendar endCalendar = Calendar.getInstance();

        begCalendar.setTime(requestDate);
        endCalendar.setTime(dealDate);

        endCalendar.get(Calendar.JANUARY     )

        System.out.println("re  : "+startDay);


     /*   int startDay = requestDate.getDate();
        int startHour = requestDate.getHours();
        int offHour = 0;

        int  = requestDate.getDate();

        System.out.println("re  : "+startDay);


        if(daySdf.format(requestDate).equals(daySdf.format(dealDate))){

            if()


        }else{

        }*/





    }

}
