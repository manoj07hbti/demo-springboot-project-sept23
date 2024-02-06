package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cube_Number {

    @RequestMapping("/cubeOfNumber")
    public String cube(){
        int number=3;
       return number*number*number +" is cube of number";

    }
}
