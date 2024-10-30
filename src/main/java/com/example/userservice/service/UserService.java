package com.example.userservice.service;

import com.example.userservice.entity.UserEntity;

public interface UserService {

    public UserEntity registerUser(UserEntity user);

    public UserEntity getUserById(Long id);
}
