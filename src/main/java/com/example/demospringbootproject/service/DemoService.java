package com.example.demospringbootproject.service;

import com.example.demospringbootproject.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    DemoRepository repositoryData;

    public String serviceData() {
        return repositoryData.repository();
    }
}