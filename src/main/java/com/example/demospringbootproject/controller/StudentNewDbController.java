package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.entity.StudentNew;
import com.example.demospringbootproject.service.StudentNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentNewDbController {
    @Autowired
    StudentNewService service;
    @PostMapping("/add_student")
    public String add(@RequestBody StudentNew student){
        return service.add(student);

    }
    @GetMapping("/get_students")
    public List<StudentNew> getAllStudents(){
        return service.getAllStudents();
    }
    @PutMapping("/update_student_name/{id}/{name}")
    public String updateName(@PathVariable long id,@PathVariable String name){
        return service.updateName(id,name);

    }
    @DeleteMapping("/remove_student_by_id/{id}")
    public String removeStudent(@PathVariable long id){
        return service.removeStudent(id);
    }
    @GetMapping("/highest_marks")
    public int getHighestMarks(){
        return service.getHighestMarks();
    }
    @GetMapping("/highest_rollNo")
    public int getHighestRollNo(){
        return service.getHighestRollNo();
    }
    @GetMapping("/first_division_students")
    public List<StudentNew> getFirstDivisionStudents(){
        return service.getFirstDivisionStudents();
    }
}
