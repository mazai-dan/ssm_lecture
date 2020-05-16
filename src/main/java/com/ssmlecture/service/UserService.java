package com.ssmlecture.service;

import com.ssmlecture.entity.UserEntity;

public interface UserService {
    UserEntity getUserById(String userId);
}
