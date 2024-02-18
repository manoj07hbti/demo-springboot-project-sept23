package com.example.demospringbootproject.RequestParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeCandidate {
    @RequestMapping("/Candidate")
    public String ages(@RequestParam int age){
        if(age<18){
            return "candidate is child";
        } else if (age>18 && age<45) {
            return "candidate is adult";

        }else if (age > 45){
            return "candidate is old";
        }

        return null;
    }
}
