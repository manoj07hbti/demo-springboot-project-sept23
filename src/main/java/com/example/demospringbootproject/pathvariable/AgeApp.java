package com.example.demospringbootproject.pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeApp {
    @RequestMapping("/age/{age}")
    public String age(@PathVariable int age){

        if(age<18 && age>18){
            return "candidate belongs to child category";

        } else{
            return "candidate belongs to young category";
        }
    }
}
