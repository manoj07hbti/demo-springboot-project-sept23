package com.example.demospringbootproject.controller.pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorPath {
    @RequestMapping("/Adding_sum/{a}/{b}")
    public String Adding(@PathVariable int a, @PathVariable int b){

       return  a + b + " is the sum of two numbers";
    }

    @RequestMapping("/Subtract/{a}/{b}")
    public String Subs(@PathVariable int a, @PathVariable int b){
        return a - b + " subtract of two numbers ";
    }

    @RequestMapping("/Multiply/{a}/{b}")
    public String Multiply(@PathVariable int a, @PathVariable int b){
        return a * b + " Multiplication of two numbers ";
    }

    @RequestMapping("/Divide/{a}/{b}")
    public String Divide(@PathVariable int a, @PathVariable int b){
        return (double) a / b + " Division of two numbers ";
    }
}
