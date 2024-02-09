package com.example.demospringbootproject.request_param;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calci_Controller {

    @RequestMapping("/addi/{a}/{b}")
    public String additionNo(@RequestParam int a, @RequestParam int b){
        return a+b +" is the addition of "+a+" and "+b  ;
    }

    @RequestMapping("/subt/{a}/{b}")
    public String substractionNo(@RequestParam int a, @RequestParam int b){
        return a-b +" is the substaction of "+a+" and "+b  ;
    }

    @RequestMapping("/multi/{a}/{b}")
    public String multiplicationNo(@RequestParam int a, @RequestParam int b){
        return a*b +" is the multiplication of "+a+" and "+b  ;
    }

    @RequestMapping("/divi/{a}/{b}")
    public String divisionNo(@RequestParam int a, @RequestParam int b){
        return (double)a/b +" is the division of "+a+" and "+b  ;
    }
}


