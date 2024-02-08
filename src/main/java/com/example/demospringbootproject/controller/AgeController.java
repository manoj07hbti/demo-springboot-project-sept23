package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeController {

    //1.write a code which will tell age status of candidate
    //              age-----> "Child" <18 or "YOung" >18 and <45  or "Old">45

    // 3. Write a Calulator controller with PathVariable
    // 4. write a code to check even and odd number
    @RequestMapping("/Age_Checker")
    public String AgeCheck(@RequestParam int age){
            if(age<18){
               return "The age of person belongs to chid " +age;
            }
            if(age>18 && age<45){
                return "The age of person belongs to Young " +age;
            }
            if(age>45){
                return "The age of person belongs to Old " +age;
            }
        return "The age checker is completed";
    }

}
