package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    @RequestMapping("/greetings")
    public String greet(@RequestParam String name){

        return "Welcome to Request param: "+name;
    }

    //url/endpoint_name?varName1=value1 & varName2=value2
    @RequestMapping("/info")
    public String display_info(@RequestParam String name,@RequestParam int age, @RequestParam String section){

        return "Student details are : "+name+" Age:"+age+" Section: "+section;
    }
}
