package com.example.demospringbootproject.crud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Price {
    ArrayList<Double>prices=new ArrayList<>();
    @RequestMapping("/price_add")
    public double add(@RequestParam double price){
        prices.add(price);
        return price;
    }
    @RequestMapping("/get_prices")
    public ArrayList<Double>getPrices(){
        return prices;
    }
    @RequestMapping("/update_price")
    public double update(@RequestParam double price,@RequestParam int index){
        prices.set(index,price);
        return price;
    }
    @RequestMapping("/price_delete")
    public String delete(@RequestParam int index){
        prices.remove(index);
        return "prices deleted";
    }
}
