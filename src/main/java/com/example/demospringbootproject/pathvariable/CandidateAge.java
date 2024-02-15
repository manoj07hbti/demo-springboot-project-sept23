package com.example.demospringbootproject.pathvariable;

import com.sun.source.tree.BreakTree;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidateAge {

    @RequestMapping("/candidate/{age}")
    public String candidateAge(@PathVariable int age){
        if(age<18){
            return "candidate is child age: ";
        } else if (age>18&age<45) {
            return "candidate is young age: ";

        } else if (age>45){
            return "candidate is old age: ";
        }

        return "candidate age";


    }
}
