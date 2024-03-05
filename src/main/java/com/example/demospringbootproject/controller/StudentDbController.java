package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.entity.Student_Demo;
import com.example.demospringbootproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentDbController {
    @Autowired
    StudentService service;
    @PostMapping("/add_student")
    public String add(Student_Demo student){
        return service.add(student);
    }
    @GetMapping("/all_stud")
    public List<Student_Demo>getAllStudent(){
        return service.getAllStudent();
    }
}
