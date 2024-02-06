package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cube {
    @RequestMapping("/cube")
    public String cube(){
        int n=7;
        return n*n*n + "is a cube of this number";
    }
}
