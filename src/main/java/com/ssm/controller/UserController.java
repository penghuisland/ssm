package com.ssm.controller;


import com.ssm.domain.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

@Autowired
private UserService userService;

    @RequestMapping()
    public List<User> test(){

        return userService.list();
    }
}
