package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.Student_Demo;
import com.example.demospringbootproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;
    public String add(Student_Demo student){
        repository.save(student);
        return "student added successfully..";
    }
    public List<Student_Demo>getAllStudent(){
        return repository.findAll();
    }


}
