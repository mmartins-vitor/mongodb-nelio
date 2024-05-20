package com.vitor.mongoproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitor.mongoproject.entities.User;
//import com.vitor.mongoproject.repository.UserRepository;
import com.vitor.mongoproject.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository rep;

    public List<User> findAll(){
        
        return rep.findAll();
    }
}
