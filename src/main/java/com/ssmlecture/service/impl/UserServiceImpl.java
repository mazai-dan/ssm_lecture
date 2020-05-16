package com.ssmlecture.service.impl;

import com.ssmlecture.entity.UserEntity;
import com.ssmlecture.mapper.UserMapper;
import com.ssmlecture.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public UserEntity getUserById(String userId) {
        return  userMapper.queryUserById(userId);
    }
}
