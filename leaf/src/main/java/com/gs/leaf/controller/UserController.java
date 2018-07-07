package com.gs.leaf.controller;

import com.gs.leaf.pojo.User;
import com.gs.leaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("get")
    public Object getUser(@RequestParam(value = "id",required = false) String id){
        User user =userService.getUserById(Integer.valueOf(id));
        return user;
    }

}
