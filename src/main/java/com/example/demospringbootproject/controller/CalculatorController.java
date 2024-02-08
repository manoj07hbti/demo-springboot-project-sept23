package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/Adding_Method")
    public String AddingMethod(){
        int A = 1;
        int B = 7;
        int Result = A+B;
        return Result +  " Printing Adding of two numbers " ;
    }

    @RequestMapping("/Subtract_Method")
    public String SubtractMethod(){
        int A = 10;
        int B = 7;
        int Result = A-B;
        return Result +  " Printing Subtracts of two numbers " ;
    }

    @RequestMapping("/Multiply_Method")
    public String MultiplyMethod(){
        int A = 10;
        int B = 7;
        int Result = A*B;
        return Result +  " Printing Multiply of two numbers " ;
    }

    @RequestMapping("/DivideMethod")
    public String DivideMethod(){
        int A = 10;
        int B = 7;
        double Result = (double) A/B;
        return Result +  " Printing Divide of two numbers " ;
    }
}
