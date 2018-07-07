package com.gs.serviceproviderdemo.controller;

import com.gs.serviceproviderdemo.MapUtils;
import com.gs.serviceproviderdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @Value("${server.port}")
    String port;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{uid}")
    public String queryUserByUid(@PathVariable("uid") Integer uid){
        Map<String,Object> result = userService.getUserById(uid);
        result.put("port",port);
        return MapUtils.map2Json(result).toJSONString();
    }




}
