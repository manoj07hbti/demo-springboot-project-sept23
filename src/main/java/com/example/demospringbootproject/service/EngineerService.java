package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.Engineer;
import com.example.demospringbootproject.repository.EngineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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
     public String updateName(String name, long id){
        Engineer engineer=repository.getById(id);
        engineer.setName(name);
        repository.save(engineer);
        return "Name Updated Successfully..."+name;
     }
    public String removeEngineer( long id){
        repository.deleteById(id);
        return "Record deleted Successfully..";

    }

}

