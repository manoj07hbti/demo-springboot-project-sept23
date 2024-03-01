package com.example.demospringbootproject.service;

import com.example.demospringbootproject.repository.App_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class App_Service {

    @Autowired
    App_Repository Repos;
    public String DemoService(){

        return Repos.DemoRepository();
    }
}
