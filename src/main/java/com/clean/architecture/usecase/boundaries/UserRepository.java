package com.clean.architecture.usecase.boundaries;


import com.clean.architecture.domain.User;

public interface UserRepository {

    User findUser(Long id);

}
