package com.example.demospringbootproject.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Prime_No {

    @RequestMapping("/primeNo")
    public void checkPrimeNo(){
        int number=5;
        boolean isPrime=true;

        for(int i=2; i<number; i++){

            if(number%i==0){
                System.out.println("Number is divisible ...");
                isPrime=false;
                break;

            }
        }

        if(isPrime){
            System.out.println("Number is Prime Number: "+number);
        }else {
            System.out.println("Number is NOT a Prime Number: "+number);
        }

    }
}
