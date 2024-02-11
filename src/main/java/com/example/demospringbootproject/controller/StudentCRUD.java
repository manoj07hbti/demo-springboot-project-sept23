package com.example.demospringbootproject.controller;
import com.example.demospringbootproject.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class StudentCRUD {
   ArrayList<Student> students=new ArrayList<>();
   @RequestMapping("/add_student/{name}/{age}/{id}/{email}")
   public String add(@PathVariable String name,
                     @PathVariable int age,
                     @PathVariable int id,
                     @PathVariable String email){
       Student student=new Student(name,age,id,email);
       students.add(student);
       return "Student Added Successfully...";

   }
   @RequestMapping("/get_student")
   public  ArrayList<Student>getStudents(){
       return students;
    }
    @RequestMapping("/update_studentName")
    public String update(@RequestParam String newName,@RequestParam int index){
       Student student=students.get(index);
       student.setName(newName);
       return "Student Name updated Successfully...";
    }
    @RequestMapping("/delete_student")
    public String delete(@RequestParam int index){
       students.remove(index);
       return "Student Name Deleted Successfully...";
    }


}
