package com.example.demospringbootproject.test_18_feb_2024;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class PrimeNumber {

    @GetMapping("/Check_PrimeNumber/{number}")
    public String checkPrimeNumber(@PathVariable int number) {

        int num= 10;
        boolean isPrime=true;

        for(int i=2; i<=number; i++){

            if(number%i==0){
                System.out.println("Number is divisible ...");
                isPrime=false;
                break;

            }
        }

        if(isPrime){

            return "Number is Prime Number: "+number;
        }
        return "Number is NOT a Prime Number: "+number;
    }
}
