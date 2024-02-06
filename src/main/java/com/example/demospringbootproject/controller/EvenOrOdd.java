package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOrOdd {

    // 4. even and odd end point;

    @RequestMapping("/EvenOrOddEndPoint")
    public void EvenOdd(){

        int number=18;

        if(number%2==0){

            System.out.println("Number is even " + number);

        }else{

            System.out.println("Number is odd " + number);
        }
    }
}
