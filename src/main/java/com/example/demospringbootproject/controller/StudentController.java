package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {

    // Student CRUD Application

    // @RequestMapping("endpoint_name/{pathVariable_name}")
    // (@PathVariable Datatype varName)

    // C - Create

    java.util.ArrayList<Student> Student= new ArrayList<>();
    @RequestMapping("/Added_Student/{name}/{rollNumber}/{marks}/{branch}")
    public String addStudent(@PathVariable String name, @PathVariable int rollNumber, @PathVariable int marks, @PathVariable String branch){

        Student student= new Student(name, rollNumber, marks, branch);
        Student.add(student);
        return student+" Added Successfully";
    }
    // R - Read/Get

    @RequestMapping("/Read_Student")
    public ArrayList<Student> Read (){

        return Student;
    }
    // U - Update

    @RequestMapping("/update_student/{newName}/{index}")
    public String Update(@PathVariable String newName, @PathVariable Integer index){
        Student student= Student.get(index);
        student.setName(newName);
        return  " student name update";
    }

    // D - Delete

    @RequestMapping("/Delete_Student/{index}")
    public String addStudent(@PathVariable int index){
        Student.remove(index);
        return " Delete Successfully";
    }
}
