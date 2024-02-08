package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class PriceCRUD {
    ArrayList<Double> prices=new ArrayList<>();
    @RequestMapping("/price_add/{price}")
    public String add(@PathVariable double price){
     prices.add(price);
     return price+" Price Added Successfully!";
    }
    @RequestMapping("prices")
    public ArrayList<Double>getPrices(){
        return prices;
    }
    @RequestMapping("/price_update")
    public String update(@RequestParam double price, @RequestParam int index){
        prices.set(index,price);
        return price+" Price Updated Successfully!";
    }
    @RequestMapping("/price_delete")
    public String delete(@RequestParam int index){
        prices.remove(index);
        return " Price Deleted Successfully!";
    }
}
