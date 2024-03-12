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
    @GetMapping("/find_by_name/{name}")
    public Doctor findDoctorByName(@PathVariable String name){
        return service.getDoctorByName(name);
    }
    @GetMapping("/find_by_specialization/{specialization}")
    public Doctor findDoctorBySpecialization(@PathVariable String specialization){
        return service.getDoctorBySpecialization(specialization);
    }
    @GetMapping("/find_by_name_specialization/{name}/{specialization}")
    public Doctor findDoctorByNameAndSpecialization(@PathVariable String name,@PathVariable String specialization){
        return service.getDoctorByNameAndSpecialization(name,specialization);
    }
    @GetMapping("/find_by_id_specialization")

    public Doctor findDoctorByIdAndSpecialization(@RequestParam long id,@RequestParam String specialization) {
        return service.getDoctorByIdAndSpecialization(id,specialization);
    }
    @GetMapping("/find_by_id_name")

    public Doctor findDoctorByIdAndName(@RequestParam long id,@RequestParam String name) {
        return service.getDoctorByIdAndName(id,name);
    }

}
