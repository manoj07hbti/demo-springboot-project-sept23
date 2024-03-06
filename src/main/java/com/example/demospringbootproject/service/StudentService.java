package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.Student;
import com.example.demospringbootproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    StudentRepository repository;

    public String add(Student student){
        repository.save(student);

        return "Student Added Successfully..";
    }
    public List<Student> getAllStudent(){

        return repository.findAll();
    }
    public Student getStudentById(Long id){
        return repository.getById(id);
    }

    public String updateName(String name,long id){
        Student student=repository.getById(id);
        student.setName(name);
        repository.save(student);
        return "Name Updated Successfully.."+name;

    }
    public String removeStudent(long id){
        repository.deleteById(id);
        return "Record deleted Successfully...";
    }
}
