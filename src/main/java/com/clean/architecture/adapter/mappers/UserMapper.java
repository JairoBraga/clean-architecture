package com.clean.architecture.adapter.mappers;

import com.clean.architecture.adapter.controller.model.UserWeb;
import com.clean.architecture.application.repository.model.UserDB;
import com.clean.architecture.domain.User;

public interface UserMapper {

    UserWeb userToWeb(User user);
    User userRepositoryToDomain(UserDB user);


}
