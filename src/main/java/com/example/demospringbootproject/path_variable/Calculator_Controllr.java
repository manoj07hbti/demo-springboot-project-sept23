package com.example.demospringbootproject.path_variable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_Controllr {

    @RequestMapping("/add/{a}/{b}")
    public String addition(@PathVariable int a, @PathVariable int b){
        return a+b +" is the addition of "+a+" and "+b  ;
    }

    @RequestMapping("/sub/{a}/{b}")
    public String substraction(@PathVariable int a, @PathVariable int b){
        return a-b +" is the substaction of "+a+" and "+b  ;
    }

    @RequestMapping("/mul/{a}/{b}")
    public String multiplication(@PathVariable int a, @PathVariable int b){
        return a*b +" is the multiplication of "+a+" and "+b  ;
    }

    @RequestMapping("/div/{a}/{b}")
    public String division(@PathVariable int a, @PathVariable int b){
        return (double)a/b +" is the division of "+a+" and "+b  ;
    }
}




