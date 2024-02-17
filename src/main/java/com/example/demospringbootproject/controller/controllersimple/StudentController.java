package com.example.demospringbootproject.controller.controllersimple;

import com.example.demospringbootproject.controller.controllersimple.model.Student;
import com.sun.jdi.event.StepEvent;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class StudentController {
    ArrayList<Student> students= new ArrayList<>();
    @RequestMapping("/Add_Student/{name}/{age}/{RollNo}/{Section}")
    public String AddStudent(@PathVariable String name,@PathVariable int age,@PathVariable int RollNo,@PathVariable String Section){
        Student student = new Student(name,age,RollNo,Section);
        students.add(student);
        return "Students data added successfully ";
    }

    @RequestMapping("Read_Data")
    public ArrayList<Student> ReadStudent(){return students;}

    @RequestMapping("/Update_Data/{name}/{index}")
    public String Updatename (@PathVariable String name,@PathVariable int index){
        Student student = students.get(index);
        student.setName(name);
        return "Student data updated successfully ";
    }
    @RequestMapping("Delete_Student_name/{index}")
    public String Deletename (@PathVariable int index){
        students.remove(index);
        return " Name deleted successfully ";
    }
}
