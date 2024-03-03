package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.DoctorEntity;
import com.example.demospringbootproject.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;

    public String doctorAdd(DoctorEntity doctorEntity){
        doctorRepository.save(doctorEntity);
        return "Doctor data added successfully";
    }

    public List<DoctorEntity> dataRead(){
        return doctorRepository.findAll();
    }
    public DoctorEntity getData(Long DocID){
        return doctorRepository.getById(DocID);
    }
}
