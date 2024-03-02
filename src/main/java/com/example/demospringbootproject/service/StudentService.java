package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.Student;
import com.example.demospringbootproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    StudentRepository repository;
    public String add( Student student){

        repository.save(student); // it will save your object into database

        return "Student added Successfully...";
    }

    public List<Student> getAllStudent(){

       return repository.findAll(); // it wil fetch all records from database

    }

    public Student getStudentById(Long id){

        return repository.getById(id); // select * from table where id=?
    }
}
