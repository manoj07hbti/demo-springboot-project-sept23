package com.example.demospringbootproject.service;

import com.example.demospringbootproject.repository.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    DemoRepo repository;
    public String demoService(){

        return repository.demoRepository();

    }
}
