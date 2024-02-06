package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandArrayList {
    @RequestMapping("/brands")
    public String[] arr(){
        String[]brands={"jaguar","ford","mercedes"};
        return brands ;
    }
}
