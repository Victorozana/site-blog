package com.site.blog.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class UserModel extends PanacheEntity{
    private String name;
    private String dt_nasc;
    private String fone;
    private String bio;
    private String email;
    private String password;
}
