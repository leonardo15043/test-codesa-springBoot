package com.example.testcodesaspringBoot.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.testcodesaspringBoot.commons.ResponseHandler;
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

    public ArrayList<UserModel> getByName(String name){
        if(name != null){
            return userRepository.findByName(name);
        }
        return this.allUsers();
    }

    public Object saveUser( UserModel user ){
        if(userRepository.existsByName(user.getName())){
            return ResponseHandler.generateResponse("Este nombre ya existe", HttpStatus.CONFLICT,user);
        }
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
