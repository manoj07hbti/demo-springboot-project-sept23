package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayList_BrandsName {

    @RequestMapping("/brands")

    public String[] brandsName(){
        String brands []={"Adidas","Nike","Puma","Reebok","Skechers"};
        System.out.println("Brands name are");
        return brands;


    }
}
