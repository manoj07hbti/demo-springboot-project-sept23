package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeController {

    @RequestMapping("/Prime_Number")
    public void PrimeNumber (){
        int num = 12;
        int count =0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(num + " The number is  a Prime Number ");
        }else{
            System.out.println( num + " Number is not prime ");
        }

    }


}
