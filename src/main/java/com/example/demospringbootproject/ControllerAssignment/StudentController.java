package com.example.demospringbootproject.ControllerAssignment;

import com.example.demospringbootproject.Service.StudentService;
import com.example.demospringbootproject.entity.StudentJava;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController
{

    @Autowired
    StudentService service;
    @PostMapping("/add_std_db")
    public String add(@RequestBody StudentJava student)
    {
       return service.add(student);

    }
    @GetMapping("/students")
    public List<StudentJava> getAllStudents(){


        return  service.getAllStudent();

    }
    @GetMapping("/student/{registration}")
    public StudentJava getStudentByReg(@PathVariable long registration){
        return service.getStudentByReg(registration);
    }

    @PutMapping("/update_name{name}/{registration}")
    public String updateName(@PathVariable String name, @PathVariable long registration){
       return service.updateName(name, registration);
    }
        @DeleteMapping("/remove/{id}")
        public String removeStudent(@PathVariable long registration){
    return service.removeStudent(registration);
        }
}
