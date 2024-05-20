package com.vitor.mongoproject.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vitor.mongoproject.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User,String>{
    
}
