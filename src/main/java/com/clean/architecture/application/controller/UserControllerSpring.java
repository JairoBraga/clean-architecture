package com.clean.architecture.application.controller;

import com.clean.architecture.adapter.controller.UserController;
import com.clean.architecture.adapter.controller.model.UserWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserControllerSpring {

    @Autowired
    private UserController userController;

    @GetMapping("/{id}")
    public UserWeb findUSer(@PathVariable("id") Long id){
        return userController.findUser(id);
    }
}
