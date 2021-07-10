package com.clean.architecture.usecase.boundaries;

import com.clean.architecture.domain.User;

public interface UserService {
    User findUser(Long userId);

}
