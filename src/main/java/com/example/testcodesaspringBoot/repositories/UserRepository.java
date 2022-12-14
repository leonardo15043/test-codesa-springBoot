package com.example.testcodesaspringBoot.repositories;

import com.example.testcodesaspringBoot.models.UserModel;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel,Long> {

    /**
     * Search users by name 👶👮💂👸 🔎
     * @param name
     * @return ArrayList<UserModel>
     */
    @Query( value = "SELECT u.* FROM users u WHERE u.name like %?1%", nativeQuery = true)
    public ArrayList<UserModel> findByName(String name);

    /**
     * Evaluates if that name exists in the user entity 👸🔎
     * @param name
     * @return
     */
    Boolean existsByName(String name);

}
