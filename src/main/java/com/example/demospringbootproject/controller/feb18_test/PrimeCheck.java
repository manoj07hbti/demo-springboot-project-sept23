package com.example.demospringbootproject.controller.feb18_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeCheck {
    @GetMapping("/Prime_Check/{num}")
    public String PrimeChecker (@PathVariable int num){
       int count=0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            return num + " is a Prime number ";
        }
        return num + " Not a Prime number ";
    }
}
