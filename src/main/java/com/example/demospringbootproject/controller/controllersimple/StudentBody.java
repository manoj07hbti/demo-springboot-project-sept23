package com.example.demospringbootproject.controller.controllersimple;

import com.example.demospringbootproject.controller.controllersimple.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentBody {
    ArrayList<Student> students=new ArrayList<Student>();
    @PostMapping("/Student_Data_Add")
    public String Studentdata(@RequestBody Student student){
    students.add(student);
    return "The student data add successfully ";
    }

    @GetMapping("/Data_Read")
    public ArrayList<Student> Readdata(){return students;}

    @PutMapping("/Update_Student_Data/{name}/{index}")
    public String Update(@PathVariable String name,@PathVariable int index){
        Student student= students.get(index);
        student.setName(name);
        return " Name updated successfully ";
    }

    @DeleteMapping("/Delete_Data/{index}")
    public String Deletedata (@PathVariable int index){
        students.remove(index);
        return "The data deleted successfully ";
    }
}
