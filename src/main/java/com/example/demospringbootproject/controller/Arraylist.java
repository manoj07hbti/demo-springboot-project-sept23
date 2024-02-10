package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Arraylist {

@RequestMapping("/List_Brand")
    public String []list(){
        String[]brands={"Armani,Gucci,Pentaloons,Levis,Blackberry"};

        return brands;
    }
}
