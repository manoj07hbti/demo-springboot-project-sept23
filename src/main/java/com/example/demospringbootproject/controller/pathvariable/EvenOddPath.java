package com.example.demospringbootproject.controller.pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOddPath {
    //
    @RequestMapping("EvenOddNum/{num}")
    public String EvenOddCheck( @PathVariable int num){

        if(num%2==0){
            return "Even Number " +num;
        }else{
            return "Odd Number " +num;
        }
    }
}
