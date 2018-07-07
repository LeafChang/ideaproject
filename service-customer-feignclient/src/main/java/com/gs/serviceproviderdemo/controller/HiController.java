package com.gs.serviceproviderdemo.controller;

import com.gs.serviceproviderdemo.service.FeignClientDemo;
import com.gs.serviceproviderdemo.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class HiController {


    @Resource
    SchedualServiceHi schedualServiceHi;

    @Autowired
    private FeignClientDemo feignClientDemo;

    @RequestMapping(value = "/user/{uid}",method = RequestMethod.GET)
    public String sayHi(@PathVariable("uid") Integer uid){
        String result = schedualServiceHi.sayHiFromClientOne(uid);
        System.out.println("===========res : " + result);
        return result;
    }

    @RequestMapping(value = "/service/{serviceName}",method = RequestMethod.GET)
    public String findServiceInfoFromEurekaByServiceName(@PathVariable("serviceName") String serviceName){
        String result = feignClientDemo.findServiceInfoFromEurekaByServiceName(serviceName);
        System.out.println("=====findServiceInfoFromEurekaByServiceName======res : " + result);
        return result;
    }


}
