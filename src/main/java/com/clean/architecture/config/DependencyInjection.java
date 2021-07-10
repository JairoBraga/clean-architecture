package com.clean.architecture.config;

import com.clean.architecture.usecase.boundaries.UserRepository;
import com.clean.architecture.usecase.boundaries.UserService;
import com.clean.architecture.usecase.user.UserServiceImpl;

public class DependencyInjection {


    public UserService userService(UserRepository userRepository){
        return new UserServiceImpl(userRepository);
    }

}
