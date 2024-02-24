package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.entity.Doctor_Entity;
import com.example.demospringbootproject.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    DoctorService service;

    @PostMapping("/add_doctor")
    public String addDoctor(@RequestBody Doctor_Entity doctor){
        return service.addDoctor(doctor);
    }

    @GetMapping("/read_doctor")
    public List<Doctor_Entity> readDoctor(){
        return service.readDoctor();
    }

    @GetMapping("/read_doctorId")
    public Doctor_Entity readDoctorById(@RequestParam Long id){
        return service.readDoctorById(id);
    }
}
