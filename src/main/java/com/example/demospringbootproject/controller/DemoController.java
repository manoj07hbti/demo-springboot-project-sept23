package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //ENDPOINT 1
    @RequestMapping("/hello")
    public void hello(){
        System.out.println("This is my first spring boot app...");
    }

    @RequestMapping("/message")
    public String message(){

        return "Hello,This is my Spring boot Application....";
    }

    @RequestMapping("/make_square")
    public String makeSquare(){

        int number=3;
        return number*number +" is Square of Given Number";
    }

}
