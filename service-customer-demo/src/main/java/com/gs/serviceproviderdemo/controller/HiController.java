package com.gs.serviceproviderdemo.controller;

import com.gs.serviceproviderdemo.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class HiController {


    @Resource
    SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/user/{uid}",method = RequestMethod.GET)
    public String sayHi(@PathVariable("uid") Integer uid){
        String result = schedualServiceHi.sayHiFromClientOne(uid);
        System.out.println("===========res : " + result);
        return result;
    }


}
