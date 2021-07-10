package com.clean.architecture.application.repository;

import com.clean.architecture.domain.User;
import com.clean.architecture.usecase.boundaries.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class JpaRepositoryH2 implements UserRepository {

    @Autowired
    private Repository repository;

    @Override
    public User findUser(Long id) {
        return null;
    }
}
