package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.Student;
import com.example.demospringbootproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;


@Service
public class StudentService {

    @Autowired
    StudentRepository repository;
    public String add( Student student){

        repository.save(student); // it will save your object into database

        return "Student added Successfully...";
    }

    public List<Student> getAllStudent(){

       return repository.findAll(); // it wil fetch all records from database

    }

    public Student getStudentById(Long id){

        return repository.getById(id); // select * from table where id=?
    }

    public String updateName( String name,long id){
       // find the record
       Student student= repository.getById(id);// select * from table where id=?
      //update name
        student.setName(name);
      //save back to database
      repository.save(student);

      return "Name Update Successfully as :"+name;
    }

    public String removeStudent( long id){

        repository.deleteById(id);

        return "Record deleted successfully...";
    }

    public Student getStudentByName(String name){

       // return repository.findByName(name); // select * from table where name=?

        return repository.findSQL(name);
    }
    public Student getStudentByNameAndId(long id, String name){

        return repository.findByIdAndName(id,name); // select * from table where name=?
    }

}
