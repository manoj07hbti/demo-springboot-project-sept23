package com.example.demospringbootproject.controller.controllerapp;

import com.example.demospringbootproject.entity.StudentDb;
import com.example.demospringbootproject.service.StudentDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentDbController {
   @Autowired
    StudentDbService studentDbService;
    @PostMapping("/Add_Student")
    public String addStudent(@RequestBody StudentDb studentDb){
        return studentDbService.addStudent(studentDb);
    }
    @GetMapping("Get_Students")
    public List<StudentDb> readStudents(StudentDb studentDb){
        return studentDbService.readStudent(studentDb);
    }
    @PutMapping("/Update_Student/{id}/{name}")
    public String updateStudent(@PathVariable String name, @PathVariable long id){
       return studentDbService.updateName(name, id);
    }
    @DeleteMapping("/Delete_Student/{id}")
    public String deleteStudent(@PathVariable long id){
        return studentDbService.deleteStudent(id);
    }
    @GetMapping("/Highest_Marks")
    public int findHighestMarks(){
    return studentDbService.findHighestMarks();
    }
    @GetMapping("/Highest_RollNo")
    public int findHighestRollNo(){
        return studentDbService.findHighestRollNo();
    }
    @GetMapping("/Student_Division_Branch")
    public List<StudentDb> findDivisionBranch(){
        return studentDbService.findDivisionBranch();
    }

}
