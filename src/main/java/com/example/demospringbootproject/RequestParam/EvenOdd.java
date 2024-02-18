package com.example.demospringbootproject.RequestParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOdd {
    @RequestMapping("/Odd_Even")
    public String oddEven(@RequestParam int a){
        if(a%2==0){
            return "this is even number";
        }else {
            return "this is odd number";
        }

    }
}
