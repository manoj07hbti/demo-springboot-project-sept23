package com.example.demospringbootproject.pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckEV {
    @RequestMapping("/check/{n}")
    public String evenOdd(@PathVariable int n){
        if(n%2==0){
            return "number is even";
        } else{
            return "number is odd";
        }
    }
}
