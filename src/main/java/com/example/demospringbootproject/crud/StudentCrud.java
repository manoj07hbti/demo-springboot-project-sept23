package com.example.demospringbootproject.crud;

import com.example.demospringbootproject.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentCrud {

     ArrayList<Student> studentCrud=new ArrayList<>();
     @RequestMapping("/add_stud")
     public String addStudent(@RequestParam String name, @RequestParam int rollNo, @RequestParam String section){
          Student student=new Student(name, rollNo, section);
          studentCrud.add(student);
          return student+"added successfully";

     }

     @RequestMapping("/read_stud")
     public ArrayList<Student> readStudent(){
          return studentCrud;
     }

     @RequestMapping("/update_stud")
     public String updateStudent(@RequestParam String newName,@RequestParam int index){
          Student student=studentCrud.get(index);
          student.setName(newName);
          return" Student name update successfully";
     }

     @RequestMapping("/delete_stud")
     public String deleteStudent(@RequestParam int index){
          studentCrud.remove(index);
          return "Deleted successfully";
     }

}
