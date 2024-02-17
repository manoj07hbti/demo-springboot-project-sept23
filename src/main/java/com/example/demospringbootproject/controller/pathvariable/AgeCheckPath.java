package com.example.demospringbootproject.controller.pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeCheckPath {

    @RequestMapping("/AgeChecker/{age}")
    public String AgeChecking(@PathVariable int age){

        if(age<18){
            return "The age belongs to child " +age;
        }
        if(age>18 && age<45){
            return "The age is belongs to Young " +age;
        } else{
            return "The age is belong to Old " +age;
        }
    }
}
