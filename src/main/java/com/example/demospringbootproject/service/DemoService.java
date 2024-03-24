package com.example.demospringbootproject.service;

import com.example.demospringbootproject.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class DemoService {

    @Autowired
    DemoRepository repository;
    public String Demoservice(){


        return repository.demoRepo();
    }

}
