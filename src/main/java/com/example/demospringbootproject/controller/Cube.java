package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cube {

    @RequestMapping("/Cube")
    public String cube(){
        int number=2;

        return number*number*number + " cube of number ";
    }
}
