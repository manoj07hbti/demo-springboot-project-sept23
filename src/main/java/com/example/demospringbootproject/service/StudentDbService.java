package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.StudentDb;
import com.example.demospringbootproject.repository.StudentDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentDbService {

    @Autowired
    StudentDbRepository studentDbRepository;
    public String addStudent(StudentDb studentDb){
       studentDbRepository.save(studentDb);
       return "Student added successfully";
    }
    public List<StudentDb> readStudent(StudentDb studentDb){
        return studentDbRepository.findAll();
    }
    public String updateName(String name, long id){
        StudentDb studentDb=studentDbRepository.getById(id);
        studentDb.setName(name);
        studentDbRepository.save(studentDb);
        return "Name updated Successfully";

    }
    public String deleteStudent(long id){
      studentDbRepository.deleteById(id);
      return "Student data deleted Successfully";
    }
    public int findHighestMarks(){
    return studentDbRepository.getHighestMarksSQL();
    }
    public int findHighestRollNo(){
        return studentDbRepository.getHighestRollNoSQL();
    }
    public List<StudentDb> findDivisionBranch(){
        return studentDbRepository.findDivisionBranchSQL();
    }
}
