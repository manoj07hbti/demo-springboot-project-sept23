package com.example.demospringbootproject.requestparam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CheckEvenOdd {
    @RequestMapping("/number")
    public String check(@RequestParam int n){
        if(n%2==0){
            return "number is even";
        } else{
            return "number is odd";
        }
    }
}
