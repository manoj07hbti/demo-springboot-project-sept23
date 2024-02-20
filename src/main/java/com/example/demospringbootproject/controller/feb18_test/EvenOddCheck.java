package com.example.demospringbootproject.controller.feb18_test;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Write an Endpoint, to print even and odd number between 231 to 333 and also
// print only those number which is divisible by 5
@RestController
public class EvenOddCheck {
    @RequestMapping("/Even_Odd_Check/{num}")
    public String EvenOddChecker (@PathVariable int num){
    int i;
    for( i =231; i<=333; i++){
        if(i % 2 == 0 && num % 5 ==0){
            return num + " is divisible by 5 and its even number ";
        }
    }
     return num + " Odd numbers ";
    }
}
