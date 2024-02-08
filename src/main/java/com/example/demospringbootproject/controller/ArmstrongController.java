package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
// 2.Write a end_point for Armstrong number
@RestController
public class ArmstrongController {
@RequestMapping("/Armstrong_Check")
    public String ArmstrongCheck(@RequestParam int num,@RequestParam int arm, @RequestParam int rem, @RequestParam int c){

    arm=10;
while (num>0){

    rem =num%10;
    arm =(rem*rem*rem)+arm;
    num=num/10;
}
    if(c==arm){
        return "The number is ArmStrong " +num;
    }else {
        return "Number is not ArmStrong " +num;
    }

    }
}
