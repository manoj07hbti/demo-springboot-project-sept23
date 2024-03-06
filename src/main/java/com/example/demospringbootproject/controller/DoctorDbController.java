package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.entity.Doctor;
import com.example.demospringbootproject.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorDbController {
    @Autowired
    DoctorService service;

    @PostMapping("/doc_add")
    public String add(@RequestBody Doctor doctor) {
        return service.add(doctor);
    }

    @GetMapping("/doctors")
    public List<Doctor> getAllDoctors(){
        return service.getAllDoctor();
    }

    @GetMapping("/doctor/{id}")
    public Doctor getDoctorById(@PathVariable Long id){
        return service.getDoctorById(id);

    }
    @PutMapping("/update_doctor_name/{name}/{id}")
    public String updateDoctorName(@PathVariable String name,@PathVariable long id){
        return  service.updateName(name,id);

    }
    @DeleteMapping("/remove_doctor/{id}")
    public String removeDoctor(@PathVariable long id){
        return service.removeDoctor(id);

    }


}