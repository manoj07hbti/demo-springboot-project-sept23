package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.entity.Students;
import com.example.demospringbootproject.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsDbController {

    @Autowired
    StudentsService service;

    @PostMapping("/add_std_db")
    public String add(@RequestBody Students student){

        return   service.add(student);
    }
    //
    @GetMapping("/students")
    public List<Students> getAllStudents(){

        return   service.getAllStudent();
    }
    //

    @GetMapping("/student/{id}")
    public Students getStudentById(@PathVariable Long id){

        return service.getStudentById(id);
    }
}
