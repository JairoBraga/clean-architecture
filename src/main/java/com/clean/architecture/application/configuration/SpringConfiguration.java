package com.clean.architecture.application.configuration;

import com.clean.architecture.adapter.controller.UserController;
import com.clean.architecture.adapter.mappers.UserMapperImpl;
import com.clean.architecture.application.repository.JpaRepositoryH2;
import com.clean.architecture.config.DependencyInjection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class SpringConfiguration {

    private JpaRepositoryH2 repositorH2 = new JpaRepositoryH2();

    private DependencyInjection dependencyInjection = new DependencyInjection();

    private UserMapperImpl userMapper = new UserMapperImpl();

    @Bean
    public UserController userController(){
        return new UserController(dependencyInjection.userService(repositorH2),userMapper);
    }
}
