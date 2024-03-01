package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.service.App_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App_Controller {
@Autowired
   App_Service service;
    @RequestMapping("/Demo_Controller")
    public String DemoController(){

        return service.DemoService();

    }
}
