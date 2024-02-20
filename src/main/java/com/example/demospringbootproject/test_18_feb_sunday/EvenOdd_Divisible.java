package com.example.demospringbootproject.test_18_feb_sunday;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOdd_Divisible {

    @GetMapping("/evenOdd_div")
    public String evenOddDiv (@RequestParam int number){
        for (int i=231;231<=333;i++){
            if(number%2==0 && number%5==0){
                return number + "is even number and divisible by 5";
            }else if(number % 2!=0 &&number%5==0){
                return number+" is odd number and divisible by 5";
            }

        }


    }
}
