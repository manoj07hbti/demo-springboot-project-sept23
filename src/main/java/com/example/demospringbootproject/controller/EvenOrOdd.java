package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOrOdd {
    public void evenOdd(){
        int n=8;
        if(n%2==0){
            System.out.println(n +"number is even");
        } else{
            System.out.println(n + "number is odd");
        }
    }
}
