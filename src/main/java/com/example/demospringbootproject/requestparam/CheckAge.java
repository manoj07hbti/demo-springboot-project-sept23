package com.example.demospringbootproject.requestparam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckAge {
    @RequestMapping("/check")
    public String age(@RequestParam int age){
        if(age<18 && age>18){
            return "candidate belong to child category";
        }else{
            return "candidate belongs to young category";
        }
    }
}
