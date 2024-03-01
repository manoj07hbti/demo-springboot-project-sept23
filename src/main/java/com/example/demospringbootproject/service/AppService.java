package com.example.demospringbootproject.service;

import com.example.demospringbootproject.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    @Autowired
    AppRepository repository; // created repository object using autowiring;
    public String demoService(){

        // AppRepository obj= new AppRepository();

        return repository.demoRepo();
    }
}
