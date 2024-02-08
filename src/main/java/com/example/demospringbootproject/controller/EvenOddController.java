package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOddController {

    @RequestMapping("/Even_Odd")
    public void EvenOdd(){

        int number =121;
        for(int i=1; i<=number; i++){
            if(number%2 ==0){
              System.out.println( number + " The number is even a number ");
              break;
            }else{
                System.out.println( number + " The number is a odd number ");
                break;
            }
        }
    }
}
