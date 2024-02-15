package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class PriceCRUD {
    ArrayList<Double> prices=new ArrayList<>();
    @PostMapping("/price_add/{price}")
    public String add(@PathVariable double price){
     prices.add(price);
     return price+" Price Added Successfully!";
    }
    @GetMapping("/prices")
    public ArrayList<Double>getPrices(){
        return prices;
    }
    @PutMapping("/price_update")
    public String update(@RequestParam double price, @RequestParam int index){
        prices.set(index,price);
        return price+" Price Updated Successfully!";
    }
    @DeleteMapping("/price_delete")
    public String delete(@RequestParam int index){
        prices.remove(index);
        return " Price Deleted Successfully!";
    }
}
