package com.example.demospringbootproject.controller.requestparam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8081/EvenOddNumbers?number=26
@RestController
public class EvenOddRequest {

    @RequestMapping("/EvenOddNumbers")
    public String EvenOdd(@RequestParam int number){

        if(number%2==0){
            return "The given number is Even number "+number;
        }else{
            return "The given number is odd number " +number;
        }
    }
}
