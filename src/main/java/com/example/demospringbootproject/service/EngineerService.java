package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.EngineerEntity;
import com.example.demospringbootproject.repository.EngineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EngineerService {
@Autowired
    EngineerRepository repository;

public String dataAdding(EngineerEntity engineerEntity){
    repository.save(engineerEntity);
    return "Engineer data added successfully";
}
public List<EngineerEntity> dataEng(EngineerEntity engineerEntity){
    return repository.findAll();
}
public EngineerEntity getID(Long id){
    return repository.getById(id);
}
}
