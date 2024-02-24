package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.Doctor_Entity;
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

    public List<Doctor_Entity> readDoctor(){
        return repository.findAll();
    }

    public Doctor_Entity readDoctorById( Long id){
        return repository.getById(id);
    }

}
