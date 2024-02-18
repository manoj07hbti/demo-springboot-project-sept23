package com.example.demospringbootproject.RequestParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Armstrong_num {

    @RequestMapping("/ArmStrong")
    public boolean num(@RequestParam int num){
        int originalNum=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
        }

        return sum==originalNum;

    }
}
