package com.example.testcodesaspringBoot.controllers;

import java.util.ArrayList;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.testcodesaspringBoot.commons.ResponseHandler;
import com.example.testcodesaspringBoot.models.UserModel;
import com.example.testcodesaspringBoot.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    /*
     * Get all users in the database 👦👨👲👳
     * @return UserService 
     */
    @GetMapping
    public ArrayList<UserModel> allUsers(){
        return userService.allUsers();
    }

    /**
     * Get user data 👵 📄
     * @param id_user
     * @return UserService 
     */
    @GetMapping( path = "/{id_user}" )
    public Optional<UserModel> getById(@PathVariable("id_user") Long id_user){
        return this.userService.getById(id_user);
    }

    /**
     * Get the results corresponding to the search by name 💂⌛
     * @param name
     * @return UserService
     */
    @GetMapping( path = "/query" )
    public ArrayList<UserModel> getByName(@RequestParam("name") String name){
        return this.userService.getByName(name);
    }

    /**
     * Save user data 👦✍
     * @param user
     * @return UserService
     */
    @PostMapping
    public Object saveUser(@Valid @RequestBody UserModel user){
       return this.userService.saveUser(user);
    }

    /**
     * Delete a user 👳⛔
     * @param id_user
     * @return {String}
     */
    @DeleteMapping( path = "/{id_user}" )
    public Object deleteUser(@PathVariable("id_user") Long id_user){
        boolean ok = this.userService.deleteUser(id_user);
        if (ok){
            return ResponseHandler.generateResponse("Se eliminó el usuario correctamente", HttpStatus.OK,null);
        }else{ 
            return ResponseHandler.generateResponse("No se pudo eliminar el usuario", HttpStatus.CONFLICT,null);
        }
    }
}
