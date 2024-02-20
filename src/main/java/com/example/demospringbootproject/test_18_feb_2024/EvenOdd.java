package com.example.demospringbootproject.test_18_feb_2024;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOdd {

    // Q1- Write a Endpoint, which will return String of output with number between 1 to 100  whether given number is even or odd.
            // like 1 is odd 2 is even 3 is odd 4 is even

    // @RequestMapping("endpoint_name/{pathVariable_name}")
    // (@PathVariable Datatype varName)

    @GetMapping("/Even_Odd/{number}")
    public void CheckEvenOdd(@PathVariable int number){

        if(number%2==0){

            System.out.println("Number is even " + number);

        }else{

            System.out.println("Number is odd " + number);
        }
    }
}
