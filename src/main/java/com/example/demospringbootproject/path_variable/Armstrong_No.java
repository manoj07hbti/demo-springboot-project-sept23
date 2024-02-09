package com.example.demospringbootproject.path_variable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Armstrong_No {

    @RequestMapping("/armstrongNo/{number}")
    public String armstrong(@PathVariable int number){

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
