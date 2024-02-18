package com.example.demospringbootproject.pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArmstrongNumber {

    @RequestMapping("/Armstrong/{num}")
    public String armstrong(@PathVariable int num){

        int originalnumber = num;
        int sum=0;
        while (num > 0){
           int rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;

        }if(sum==originalnumber){
            return "this number is armstrong";
        }else {
            return "this number is not armstrong";
        }


    }
}
