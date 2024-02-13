package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CRUDPrice {

    // CRUD Price Application

    java.util.ArrayList<Double> Price= new java.util.ArrayList<>();

    // C - Create or Add

    @RequestMapping("/Price_add/{price}")
    public Double add (@PathVariable Double price){

        Price.add(price);
        return price;
    }

    // R - Read or Get

    @RequestMapping("/Price_Read")
    public ArrayList<Double> getPrice (){

        return getPrice();
    }

    // U - Update
    @RequestMapping("/Price_update")
    public Double Update(@RequestParam Double prices, @RequestParam int index){

        Price.set(index, prices);
        return prices;
    }

    // D - Delete

    @RequestMapping("/price_Delete")
    public String Delete (@RequestParam int index){

        Price.remove(index);
        return " Prices Delete";
    }
}
