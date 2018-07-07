package com.gs.serviceproviderdemo.service.impl;

import com.gs.serviceproviderdemo.mapper.UserMapper;
import com.gs.serviceproviderdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Map<String, Object> getUserById(Integer uid) {
        Map<String, Object> params = new HashMap<String, Object>(2);
        params.put("uid",uid);

        return (Map<String, Object>) userMapper.selectByPrimaryKey(params);
    }
}
