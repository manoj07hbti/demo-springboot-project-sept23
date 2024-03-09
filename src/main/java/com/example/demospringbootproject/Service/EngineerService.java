package com.example.demospringbootproject.Service;

import com.example.demospringbootproject.entity.Engineer;
import com.example.demospringbootproject.repository.EngineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EngineerService
{
    @Autowired
    EngineerRepository repository;
    public String add(Engineer engineer){
        repository.save(engineer);

        return "Engineer added successfully";
    }

    public List<Engineer> getAllEngineer(){
       return repository.findAll();
    }

    public Engineer getEngineerbyID(Long id){
   return repository.getById(id);
    }

    public String updateName(String name, long id)
    {
        Engineer student = repository.getById(id);
        student.setName(name);
        repository.save(student);

        return "Name Updated successfully";

    }
    public String removeStudent(long id){
        repository.deleteById(id);

        return "Record deleted successfully";
    }
}

