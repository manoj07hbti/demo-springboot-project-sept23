package com.example.demospringbootproject.controller.requestparam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorRequest {
    @RequestMapping("/sum")
    public String results (@RequestParam int a, @RequestParam int b){
     return  a + b + " The sum of both numbers are ";
    }

    @RequestMapping("/Subtract")
    public String Subs (@RequestParam int a, @RequestParam int b){
        return  a - b + " The Subtract of both numbers ";
    }

    @RequestMapping("/Multiply")
    public String Multiply (@RequestParam int a, @RequestParam int b){
        return  a * b + " The Multiplication of both numbers ";
    }

    @RequestMapping("/Divide")
    public String Divide (@RequestParam int a, @RequestParam int b){
        return (double) a / b + " The Division of both numbers ";
    }
}
