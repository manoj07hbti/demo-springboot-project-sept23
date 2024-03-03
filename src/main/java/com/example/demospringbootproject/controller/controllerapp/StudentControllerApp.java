package com.example.demospringbootproject.controller.controllerapp;

import com.example.demospringbootproject.entity.StudentEntity;
import com.example.demospringbootproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentControllerApp {
@Autowired
    StudentService service;
@PostMapping("/Student_add_con")
    public String studentAdd(@RequestBody StudentEntity student){
    return service.add(student);
}

@GetMapping("/Read_Student_data")
    public List<StudentEntity> getData(){
    return service.getData();

}
@GetMapping("/Single_Student_data/{id}")
    public StudentEntity getById(@PathVariable Long id){
 return service.getStudentId(id);
}

}
