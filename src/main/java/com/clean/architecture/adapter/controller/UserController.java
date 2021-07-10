package com.clean.architecture.adapter.controller;

import com.clean.architecture.adapter.controller.model.UserWeb;
import com.clean.architecture.adapter.mappers.UserMapper;
import com.clean.architecture.domain.User;
import com.clean.architecture.usecase.boundaries.UserService;

public class UserController{

    private final UserMapper userMapper;

    private final UserService userService;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    public UserWeb findUser(Long userId){
        User user = userService.findUser(userId);
        return userMapper.userToWeb(user);
    }
}
