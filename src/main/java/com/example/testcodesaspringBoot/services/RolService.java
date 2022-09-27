package com.example.testcodesaspringBoot.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testcodesaspringBoot.models.RolModel;
import com.example.testcodesaspringBoot.repositories.RolRepository;

@Service
public class RolService {
    
    @Autowired
    RolRepository rolRepository;

    public ArrayList<RolModel> allRols(){
        return (ArrayList<RolModel>) rolRepository.findAll();
    }

    public Optional<RolModel> getById( Long id_rol ){
        return rolRepository.findById(id_rol);
    }

    public RolModel saveRol( RolModel rol ){
        return rolRepository.save(rol);
    }

    public boolean deleteRol(Long id_rol){
        try {
            rolRepository.deleteById(id_rol);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
