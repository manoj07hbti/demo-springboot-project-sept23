package com.example.demospringbootproject.RequestParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculater_RequestParam {
    @RequestMapping("/@Addition")
    public String add(@RequestParam int a ,@RequestParam int b){

        return a+b  +" :is the Addition";

    }
    @RequestMapping("/@Subtraction")
    public String sub(@RequestParam int a,@RequestParam int b){
        return a-b  +": is the subtraction";
    }
    @RequestMapping("/@multiplication")
    public String multi(@RequestParam int a,@RequestParam int b){
        return a*b  +": is the multiplication";
    }
    @RequestMapping("/@division")
    public String div(@RequestParam int a,@RequestParam int b){
        return (double)a/b  +": is the division";
    }

}
