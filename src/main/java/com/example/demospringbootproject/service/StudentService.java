package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.Student_Entity;
import com.example.demospringbootproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;
    public String addstudent(Student_Entity student){
        repository.save(student);
        return "Student added successfully";
    }

    public List<Student_Entity> readStudent(){
       return repository.findAll();
    }

    public Student_Entity readStudentById(Long id){
        return repository.getById(id);
    }
}
