package com.clean.architecture.usecase.user;

import com.clean.architecture.domain.User;
import com.clean.architecture.usecase.boundaries.UserRepository;
import com.clean.architecture.usecase.boundaries.UserService;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUser(Long userId) {
        return userRepository.findUser(userId);
    }
}
