package com.gs.leaf.service.impl;

import com.gs.leaf.mapper.UserMapper;
import com.gs.leaf.pojo.User;
import com.gs.leaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
