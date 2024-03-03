package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.StudentEntity;
import com.example.demospringbootproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public String add(StudentEntity student){
    repository.save(student);
    return "Student added Successfully";
    }
    public List<StudentEntity> getData(){
    return repository.findAll();
    }

    public StudentEntity getStudentId(Long id){
    return repository.getById(id);
    }
}
