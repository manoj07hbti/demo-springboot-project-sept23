package com.example.demospringbootproject.crud;

import com.example.demospringbootproject.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Student_Controller {
    ArrayList<Student> students=new ArrayList<>();
    @PostMapping("/add_Student/{name}/{age}/{course}")
    public String add_student(@PathVariable String name,@PathVariable int age,@PathVariable String course){
        Student student=new Student(name, age, course);
        students.add(student);
        return "student added successfully";

    }
    @PostMapping("/post_Student")
    public String post_student(@RequestBody Student student){
        students.add(student);
        return "added successfully";
    }
    @GetMapping("/read_student")
    public ArrayList<Student> read_student(){
        return students;
    }
    @PutMapping("/update_student")
    public String update(@RequestParam String name,@RequestParam int index){
        Student student=students.get(index);
        student.setName(name);
        return "student name updated successfully";

    }
    @DeleteMapping("/delete_student")
    public String delete(@RequestParam int index){
        Student student=students.remove(index);
        return "student delete successfully";
    }
}
