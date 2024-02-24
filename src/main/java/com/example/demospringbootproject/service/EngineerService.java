package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.Engineer_Entity;
import com.example.demospringbootproject.repository.EngineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineerService {

    @Autowired
    EngineerRepository repository;

    public String addEngineer(Engineer_Entity engineer){
        repository.save(engineer);
        return "Engineer added successfully";
    }

    public List<Engineer_Entity> readEngineer(){
        return repository.findAll();
    }

    public Engineer_Entity readEngineerById(Long id){
        return repository.getById(id);
    }
}


