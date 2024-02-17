package com.example.demospringbootproject.controller.crud;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class PriceCrud {
    ArrayList<Double> Price=new ArrayList<>();
   @PostMapping("/Add_Price/{price}")
    public String PriceAdd(@PathVariable double price){
       Price.add(price);
        return price + " Price added successfully ";
    }
    @GetMapping("/Read_prices")
    public ArrayList<Double> ReadPrice(){return Price;}

    @PutMapping("/Update_Price/{price}/{index}")
    public String Updateprice (@PathVariable double price, @PathVariable int index){
       Price.set(index, price);
       return price + " Price updated successfully ";
    }
    @DeleteMapping("Delete_Price")
    public String Deleteprice(@RequestParam int index){
       Price.remove(index);
       return " Price deleted Successfully ";
    }

}
