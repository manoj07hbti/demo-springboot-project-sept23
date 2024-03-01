package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppArchController {

    @Autowired
    AppService service; // it is creating object of service class using Autowiring;
    @RequestMapping("/app_arch")
    public String demo(){

        //AppService obj= new AppService(); // not allowed as we have DI;

        return service.demoService();
    }
}
