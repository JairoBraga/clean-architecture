package com.clean.architecture.adapter.mappers;

import com.clean.architecture.adapter.controller.model.UserWeb;
import com.clean.architecture.application.repository.model.UserDB;
import com.clean.architecture.domain.User;

public class UserMapperImpl implements UserMapper{
    @Override
    public UserWeb userToWeb(User user) {
        return new UserWeb(user.getName(),user.getLastName(),user.getAge());
    }

    @Override
    public User userRepositoryToDomain(UserDB user) {
        return new User(user.getName(),user.getLastName(),user.getAge());
    }
}
