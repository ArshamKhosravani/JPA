package com.javatpoint.jpaexample.controller;

import com.javatpoint.jpaexample.model.UserRecord;
import com.javatpoint.jpaexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public List getAllusers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/add-user",method = RequestMethod.POST)
    public void addUser(UserRecord userRecord){
        userService.addUser(userRecord);
    }
}
