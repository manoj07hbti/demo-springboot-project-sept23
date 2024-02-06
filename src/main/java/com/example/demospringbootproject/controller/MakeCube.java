package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MakeCube {

    // 1. cube of number;

    @RequestMapping("/make_cube")
    public String makeCube(){

        int number= 3;
        return  number*number*number +" is cube given number";
    }
}
