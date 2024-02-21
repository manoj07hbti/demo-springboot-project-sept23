package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.controller.model.StudentNew;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentController {
    ArrayList<StudentNew> students=new ArrayList<>();
    @PostMapping("/add_Stud")
    public String addStud(@RequestBody StudentNew student){
        students.add(student);
        return  "Student Added Successfully...";
    }
    @GetMapping("/get_Stud")
    public ArrayList<StudentNew> getStudents(){
        return students;
    }
    @PutMapping("/update_Stud")
    public String updateStud(@RequestParam String newSubj,@RequestParam int index){
        StudentNew student=students.get(index);
        student.setStudSubj(newSubj);
        return "Subject Name updated Successfully...";
    }
    @DeleteMapping("/delete_Stud")
    public String deleteStud(@RequestParam int index){
        students.remove(index);
        return "Student Name Deleted Successfully...";
    }

}
