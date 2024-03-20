package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.StudentNew;
import com.example.demospringbootproject.repository.StudentNewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentNewService {
    @Autowired
    StudentNewRepository repository;

    public String add(@RequestBody StudentNew student){
        repository.save(student);
        return "Student Added Successfully....";
    }
    public List<StudentNew> getAllStudents(){
        return repository.getAllStudentsSQL();
    }
    public String updateName(long id,String name){
        repository.updateNameByIdSQL(name,id);
        return "Name Updated Successfully...";
    }
    public String removeStudent(long id){
        repository.removeStudentSQL();
        return "Student Deleted Successfully...";
    }
    public int getHighestMarks(){

        return repository.getHighestMarksSQL();

    }
    public int getHighestRollNo(){
        return repository.getHighestRollNoSQL();
    }
    public List<StudentNew> getFirstDivisionStudents(){
        return repository.getFirstDivisionStudentsSQL();
    }

}
