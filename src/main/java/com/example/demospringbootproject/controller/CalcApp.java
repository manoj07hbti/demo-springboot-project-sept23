package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcApp {
    int a=5;
    int b=7;
    @RequestMapping("/add")
    public int add(){
        int sum=a+b;
        return sum;
    }
    @RequestMapping("/sub")
    public int subtraction(){
        int sub=a-b;
        return sub;
    }
    @RequestMapping("/multi")
    public int multi(){
        int multiply=a*b;
        return multiply;
    }
    @RequestMapping("/div")
    public double divide(){
        double div=(double)a/b;
        return div;
    }
}
