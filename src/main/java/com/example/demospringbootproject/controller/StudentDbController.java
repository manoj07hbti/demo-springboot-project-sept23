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

    @PostMapping("/add_std_db")
    public String add(@RequestBody Student student){

      return   service.add(student);

    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){

      return   service.getAllStudent();

    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable Long id){

        return service.getStudentById(id);
    }

    //UPDATE

    @PutMapping("/update_name/{name}/{id}")
    public String updateName(@PathVariable String name,@PathVariable long id){

      return   service.updateName(name,id);
    }

    // delete

    @DeleteMapping("/remove/{id}")
   public String removeStudent(@PathVariable long id){

        return service.removeStudent(id);
    }
}
