package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_Controller {

    int a=25;
    int b=4;

    @RequestMapping("/add")
    public String addition(){
      return a+b +" is the addition of "+a+" and "+b  ;
    }

    @RequestMapping("/sub")
    public String substraction(){
        return a-b +" is the substaction of "+a+" and "+b  ;
    }

    @RequestMapping("/mul")
    public String multiplication(){
        return a*b +" is the multiplication of "+a+" and "+b  ;
    }

    @RequestMapping("/div")
    public String division(){
        return (double)a/b +" is the division of "+a+" and "+b  ;
    }
}
