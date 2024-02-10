package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculater {

    int x=4;
    int y=2;

    @RequestMapping("/Addition")
    public String add(){
    int sum = x + y;
    return sum + " is a addition ";

    }
    @RequestMapping("/Subtraction")
    public String sub(){
        int result= x - y;
        return result +" is a subtraction";
    }
    @RequestMapping("/Multiply")
    public String multi(){
        int multiply = x * y;
        return multiply +"is a multiply";
    }
    @RequestMapping("/Divide")
    public String div(){
        double divide=(double)x/y;
        return divide +"is a division";
    }
}
