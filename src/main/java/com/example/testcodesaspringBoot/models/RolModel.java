package com.example.testcodesaspringBoot.models;
import javax.persistence.*;

@Entity
@Table(name = "rol")

public class RolModel{

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_rol;

    private String name;

    public Long getIdRol(){
        return id_rol;
    }

    public void setIdRol( Long id_rol ){
        this.id_rol = id_rol;
    }

    public String getName(){
        return name;
    }

    public void setName( String name ){
        this.name = name;
    }

}