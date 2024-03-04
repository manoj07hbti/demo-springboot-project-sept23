package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.entity.Student;
import com.example.demospringbootproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDbController {
    @Autowired
    StudentService service;

    @PostMapping("/add_stud")
    public String add(@RequestBody Student student){

        return service.add(student);

    }
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return service.getAllStudent();
    }
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable Long id){
        return service.getStudentById(id);
    }

}
