package com.example.testcodesaspringBoot.repositories;

import com.example.testcodesaspringBoot.models.RolModel;

import org.springframework.data.repository.CrudRepository;

public interface RolRepository extends CrudRepository<RolModel,Long> {
    
}
