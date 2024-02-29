package com.example.demospringbootproject.controller.reqparam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOddReqParam {
    @RequestMapping("/EvenOdd")
    public String evenOdd(@RequestParam int n){
        if (n%2==0){
            return "Its an even number "+n;
        }else {
            return "Its an odd number "+n;
        }
    }
}
