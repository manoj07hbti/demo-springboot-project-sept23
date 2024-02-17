package com.example.demospringbootproject.controller.crud;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class PriceCrud {
    ArrayList<Double> Price=new ArrayList<>();
   @RequestMapping("/Add_Price/{price}")
    public String PriceAdd(@PathVariable double price){
       Price.add(price);
        return price + " Price added successfully ";
    }
    @RequestMapping("/Read_prices")
    public ArrayList<Double> ReadPrice(){return Price;}

    @RequestMapping("/Update_Price/{price}/{index}")
    public String Updateprice (@PathVariable double price, @PathVariable int index){
       Price.set(index, price);
       return price + " Price updated successfully ";
    }
    @RequestMapping("Delete_Price")
    public String Deleteprice(@RequestParam int index){
       Price.remove(index);
       return " Price deleted Successfully ";
    }

}
