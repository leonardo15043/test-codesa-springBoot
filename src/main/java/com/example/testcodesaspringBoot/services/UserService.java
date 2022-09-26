package com.example.testcodesaspringBoot.services;

import java.util.ArrayList;
import java.util.Optional;

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

    public Optional<UserModel> getById(Long id_user){
        return userRepository.findById(id_user);
    }

    public UserModel saveUser( UserModel user ){
        return userRepository.save(user);
    }

    public boolean deleteUser(Long id_user){
        try {
            userRepository.deleteById(id_user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
