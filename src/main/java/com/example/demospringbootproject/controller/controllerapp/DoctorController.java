package com.example.demospringbootproject.controller.controllerapp;

import com.example.demospringbootproject.entity.DoctorEntity;
import com.example.demospringbootproject.repository.DoctorRepository;
import com.example.demospringbootproject.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    DoctorService service;
    @PostMapping("/Doctor_Add")
    public String doctorAdd(@RequestBody DoctorEntity doctorEntity){
        return service.doctorAdd(doctorEntity);
    }

    @GetMapping("/Data_Read_Doctors")
    public List<DoctorEntity> dataRead(){
    return service.dataRead();
    }

    @GetMapping("/Doctor_ID/{DocID}")
    public DoctorEntity getData(@PathVariable Long DocID){
        return service.getData(DocID);
    }
}
