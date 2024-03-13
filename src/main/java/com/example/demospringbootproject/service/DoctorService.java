package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.Doctor_Entity;
import com.example.demospringbootproject.entity.Employee_Entity;
import com.example.demospringbootproject.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Service
public class DoctorService {
    @Autowired
    DoctorRepository repository;

    public String addDoctor( Doctor_Entity doctor){
        repository.save(doctor);
        return "Doctor added successfully";
    }

    public List<Doctor_Entity> readDoctor() {
        return repository.findAll();
    }

    // Select doctor by Id

    public Doctor_Entity readDoctorById( Long id){
        return repository.getById(id);
    }

    // Select doctor by name

    public Doctor_Entity getByName(String name){
        return repository.findByName(name);
    }

    // Select doctor by department

    public Doctor_Entity getByDepartment(String department){
        return repository.findByDepartment(department);
    }

    // Select doctor by name and department

    public Doctor_Entity getByNameAndDepartment(String name,String department){
        return repository.findByNameAndDepartment(name,department);
    }

    // Select doctor by Id and Name

    public Doctor_Entity getByIdAndName(Long id,String name){
        return repository.findByIdAndName(id,name);

    }

    // Select doctor by Id and Department

    public Doctor_Entity getByIdAndDepartment(Long id,String department){
        return repository.findByIdAndDepartment(id,department);
    }
}


