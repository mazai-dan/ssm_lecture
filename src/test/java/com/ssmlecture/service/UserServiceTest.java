package com.ssmlecture.service;

import com.ssmlecture.entity.UserEntity;
import com.ssmlecture.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void mytest(){
            UserEntity user = userService.getUserById("148ebd30-8db4-11ea-8df8-35d27ee2c563");
        System.out.println(user.toString());
    }
}