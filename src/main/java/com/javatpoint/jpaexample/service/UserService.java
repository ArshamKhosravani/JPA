package com.javatpoint.jpaexample.service;

import com.javatpoint.jpaexample.model.UserRecord;
import com.javatpoint.jpaexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserRecord> getAllUsers() {
        return (ArrayList) userRepository.findAll();

    }

    public void addUser(UserRecord userRecord) {
        userRepository.save(userRecord);
    }
}
