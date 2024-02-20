package com.example.demospringbootproject.controller.feb18_test;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Write a Endpoint, which will return String of output with number between1 to 100  whether given number is even or odd.
//        like 1 is odd 2 is even 3 is odd 4 is even/**/
@RestController
public class EvenOddEndpoint {
    @RequestMapping("/Even_Odd/{num}")
    public String EvenOdd (@PathVariable int num){
        if(num>=1 || num<=100)
            if(num%2==0){
                return "The number is Even " +num;
            }else{
                return "The number is a Odd " +num;
            }
        return "Number is not in the range of 1 to 100 ";
        }
    }

