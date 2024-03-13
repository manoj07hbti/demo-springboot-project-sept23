package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.entity.Doctor_Entity;
import com.example.demospringbootproject.entity.Employee_Entity;
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
    public String addDoctor(@RequestBody Doctor_Entity doctor) {
        return service.addDoctor(doctor);
    }

    @GetMapping("/read_doctor")
    public List<Doctor_Entity> readDoctor() {
        return service.readDoctor();
    }

    @GetMapping("/read_doctorId")
    public Doctor_Entity readDoctorById(@RequestParam Long id) {
        return service.readDoctorById(id);
    }

    @GetMapping("/read_doctor_name")
    public Doctor_Entity getByName(@RequestParam String name) {
        return service.getByName(name);
    }

    @GetMapping("/read_department")
    public Doctor_Entity getByDepartment(@RequestParam String department) {
        return service.getByDepartment(department);
    }

    @GetMapping("/read_name_department")
    public Doctor_Entity getByNameAndDepartment(@RequestParam String name, @RequestParam String department) {
        return service.getByNameAndDepartment(name, department);
    }

    @GetMapping("/read_id_name")
    public Doctor_Entity getByIdAndName(@RequestParam Long id, @RequestParam String name) {
        return service.getByIdAndName(id, name);
    }

    @GetMapping("/read_id_department")
    public Doctor_Entity getByIdAndDepartment(Long id,String department){
        return service.getByIdAndDepartment(id,department);
    }


}