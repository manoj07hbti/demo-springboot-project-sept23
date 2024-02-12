package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {

    ArrayList<Student>Student=new ArrayList<>();
    @RequestMapping("/add_student")
    public String addStu(){
        Student student=new Student("Raj","a",23,11);
        Student.add(student);
        return "information of student";

    }
    @RequestMapping("/all_student")
    public ArrayList<Student>getStudent(){
        return Student;
    }
    @RequestMapping("/update_student")
    public String updateStu(@RequestParam String newName,@RequestParam int index){
        Student student=Student.get(index);
        student.setName(newName);
        return "student name updated";
    }
    @RequestMapping("/stu_delete")
    public String delete(@RequestParam int index){
        Student.remove(index);
        return "deleted successfully";
    }
}
