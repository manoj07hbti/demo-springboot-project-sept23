package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayList {

    // 3. ArrayList String : brands name;

    @RequestMapping("/BrandNames")
    public String[] array (){

        String[] brands= new String[]{"Amazon", "Apple", "Google", "Microsoft", "Walmart"};
        System.out.println(" Brand Names: ");
        return brands;
    }
}
