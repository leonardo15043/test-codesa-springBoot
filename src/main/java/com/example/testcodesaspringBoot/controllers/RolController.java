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

    @GetMapping
    public ArrayList<RolModel> allRols(){
        return rolService.allRols();
    }

    @GetMapping( path = "/{id_rol}" )
    public Optional<RolModel> getById(@PathVariable("id_rol") Long id_rol){
        return this.rolService.getById(id_rol);
    }

    @PostMapping
    public Object saveRol(@Valid @RequestBody RolModel rol){
       return this.rolService.saveRol(rol);
    }

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
