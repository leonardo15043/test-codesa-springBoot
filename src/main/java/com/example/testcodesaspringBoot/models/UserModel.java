package com.example.testcodesaspringBoot.models;
import javax.persistence.*;

@Entity
@Table(name = "users")

public class UserModel {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_user;

    private String name;
    private Boolean active;
    private String email;

    public Long getIdUser(){
        return id_user;
    }

    public void setIdUser( Long id_user ){
        this.id_user = id_user;
    }

    public String getName(){
        return name;
    }

    public void setName( String name ){
        this.name = name;
    }

    public Boolean getActive(){
        return active;
    }

    public void setActive( Boolean active ){
        this.active = active;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail( String email ){
        this.email = email;
    }
   
}
