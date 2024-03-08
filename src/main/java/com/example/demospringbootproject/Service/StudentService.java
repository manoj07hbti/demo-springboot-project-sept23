package com.example.demospringbootproject.Service;

import com.example.demospringbootproject.entity.StudentJava;
import com.example.demospringbootproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class StudentService
{
    @Autowired
    StudentRepository repository;

    public String add(StudentJava student){
        repository.save(student);

        return "Student added successfully";

    }

    public List<StudentJava> getAllStudent(){

      return  repository.findAll();
    }
    public StudentJava getStudentByReg(Long registration){

       return repository.getById(registration);

    }
    public String updateName(String name long registration)
    {
        StudentJava student = repository.getById(registration);
        student.setName(name);
        repository.save(student);

        return "Name Updated successfully";

    }
    public String removeStudent(long registration){
    repository.deleteById(registration);

    return "Record deleted successfully";
    }
}
