package com.example.testcodesaspringBoot.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testcodesaspringBoot.models.UserModel;
import com.example.testcodesaspringBoot.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    
    public ArrayList<UserModel> allUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser( UserModel user ){
        return userRepository.save(user);
    }
}
