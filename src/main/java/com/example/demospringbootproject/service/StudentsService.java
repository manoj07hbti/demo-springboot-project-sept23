package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.Students;
import com.example.demospringbootproject.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

    @Autowired
    StudentsRepository repository;
    public String add( Students student){

        repository.save(student);

        return "Student added Successfully...";
    }
    public List<Students> getAllStudent(){

        return repository.findAll();
    }
    public Students getStudentById(Long id){

        return repository.getById(id); // select * from table where id=?
    }
}
