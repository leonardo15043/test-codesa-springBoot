package com.example.testcodesaspringBoot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testcodesaspringBoot.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    
}
