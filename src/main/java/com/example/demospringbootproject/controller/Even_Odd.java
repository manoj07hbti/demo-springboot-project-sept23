package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Even_Odd {

    @RequestMapping("/Even_Odd")
    public String evenOdd(){


        int num = 4;

       if( num % 2 == 0){
            System.out.println(  num +"is a even number");

        }else{
            System.out.println(num +"is a odd number");
        }


        return num  +"is a even number";

    }


}
