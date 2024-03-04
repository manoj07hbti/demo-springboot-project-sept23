package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.Engineer;
import com.example.demospringbootproject.repository.EngineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineerService {
    @Autowired
    EngineerRepository repository;
    public String add(Engineer engineer){
        repository.save(engineer);
        return "Engineer Added Successfully..";

    }
    public List<Engineer> getAllEngineers(){
        return repository.findAll();
    }
    public Engineer getEngineerById(Long RollNo){
        return repository.getById(RollNo);
    }

}
