package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.entity.Student_Entity;
import com.example.demospringbootproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/add_std")
    public String addStudent(@RequestBody Student_Entity student){
        return service.addstudent(student);

    }

    @GetMapping("/read_std")
    public List<Student_Entity> readStudent(){
        return service.readStudent();
    }

    @GetMapping("/read_id")
    public Student_Entity readStudentById(@RequestParam Long id){
        return service.readStudentById(id);

    }

}