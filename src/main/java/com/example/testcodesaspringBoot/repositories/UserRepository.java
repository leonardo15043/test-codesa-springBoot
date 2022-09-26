package com.example.testcodesaspringBoot.repositories;

import com.example.testcodesaspringBoot.models.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel,Long> {
    
}
