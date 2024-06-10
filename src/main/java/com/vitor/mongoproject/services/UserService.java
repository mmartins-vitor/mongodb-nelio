package com.vitor.mongoproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitor.mongoproject.dto.UserDTO;
import com.vitor.mongoproject.entities.User;
//import com.vitor.mongoproject.repository.UserRepository;
import com.vitor.mongoproject.repository.UserRepository;
import com.vitor.mongoproject.services.exception.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {

        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!!!"));
    }

    public User insert(User obj){
        return repo.insert(obj);
    }

    public User fromDTO(UserDTO objDto){
        
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
