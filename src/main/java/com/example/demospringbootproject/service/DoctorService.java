package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.Doctor;
import com.example.demospringbootproject.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository repository;
    public String add(Doctor doctor){
        repository.save(doctor);
        return "Doctor Added Successfully...";
    }

    public List<Doctor> getAllDoctor(){
        return repository.findAll();
    }

    public Doctor getDoctorById(Long id){
        return repository.getById(id);
    }
    public String updateName( String name, long id){
        Doctor doctor=repository.getById(id);
        doctor.setName(name);
        repository.save(doctor);
        return "Doctor name updated Successfully.."+name;

    }
    public String removeDoctor(long id){
        repository.deleteById(id);
        return "Record deleted Successfully..";

    }
    public Doctor getDoctorByName(String name){
        return repository.findByName(name);
    }
    public Doctor getDoctorBySpecialization(String specialization){
        return repository.findBySpecialization(specialization);
    }
    public Doctor getDoctorByNameAndSpecialization(String name,String specialization){
        return repository.findByNameAndSpecialization(name,specialization);
    }
    public Doctor getDoctorByIdAndSpecialization(long id,String specialization) {
        return repository.findByIdAndSpecialization(id, specialization);
    }
    public Doctor getDoctorByIdAndName(long id,String name) {
        return repository.findByIdAndName(id, name);
    }

    }
