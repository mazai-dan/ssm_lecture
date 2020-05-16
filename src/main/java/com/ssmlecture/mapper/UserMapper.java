package com.ssmlecture.mapper;

import com.ssmlecture.entity.UserEntity;

public interface UserMapper {

    UserEntity queryUserById(String id);
}
