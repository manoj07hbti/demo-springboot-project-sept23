package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    DemoService service;
    @RequestMapping("/demo_controller")
    public String demo(){


        return service.demoService();

    }
}
