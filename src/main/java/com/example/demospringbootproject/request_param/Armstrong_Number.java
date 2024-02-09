package com.example.demospringbootproject.request_param;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Armstrong_Number {

    @RequestMapping("/checkArmstrongNo")
    public String armstrongNumber(@RequestParam int number){

        int num, temp, total=0;
        num=number;
        while(num >0){
            temp=num%10;
            total=total+temp*temp*temp;
            num=num/10;
        }
        if(total==number){
            return "Number is Armstrong: "+number;
        }else {
            return "Number is not Armstrong: "+number;
        }



    }
}
