package com.example.testcodesaspringBoot.controllers;

import java.util.ArrayList;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testcodesaspringBoot.models.RolModel;
import com.example.testcodesaspringBoot.services.RolService;

@RestController
@RequestMapping("/rol")
public class RolController {
    @Autowired
    RolService rolService;

    /**
     * Get the list of roles. 📘📗📙📕
     * @return RolService
     */
    @GetMapping
    public ArrayList<RolModel> allRols(){
        return rolService.allRols();
    }

    /*
     * Get role information. 📘
     * @param id_rol
     * @return RolService
     */
    @GetMapping( path = "/{id_rol}" )
    public Optional<RolModel> getById(@PathVariable("id_rol") Long id_rol){
        return this.rolService.getById(id_rol);
    }

    /*
     * Save or update role information 📋✔
     * @param @Valid  Marks a property, method parameter or method return type for validation cascading.
     * @param @RequestBody  Annotation indicating a method parameter should be bound to the body of the web request.
     * @return RolService
     */
    @PostMapping
    public Object saveRol(@Valid @RequestBody RolModel rol){
       return this.rolService.saveRol(rol);
    }

    /*
     * Delete a role 📜❌
     * @param id_rol
     * @return {String}
     */
    @DeleteMapping( path = "/{id_rol}" )
    public String deleteUser(@PathVariable("id_rol") Long id_rol){
        boolean ok = this.rolService.deleteRol(id_rol);
        if (ok){
            return "Se eliminó el rol correctamente ";
        }else{ 
            return "No se pudo eliminar el rol";
        }
    }
}
