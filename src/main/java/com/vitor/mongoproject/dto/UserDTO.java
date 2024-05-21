package com.vitor.mongoproject.dto;

import java.io.Serializable;

import com.vitor.mongoproject.entities.User;

public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public String id;
    public String name;
    public String email;

    public UserDTO() {
    };

    public UserDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
