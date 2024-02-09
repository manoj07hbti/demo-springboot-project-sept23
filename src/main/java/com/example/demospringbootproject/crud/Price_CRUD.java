package com.example.demospringbootproject.crud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Price_CRUD {

    ArrayList<Integer> priceCrud = new ArrayList();

    // C- Create or Add
    @RequestMapping("/price_add")
    public String priceAdd(@RequestParam int price) {
        priceCrud.add(price);
        return price + " added successfully";
    }

    // R- Read or Get
    @RequestMapping("/price_read")
    public ArrayList<Integer> priceRead() {
        return priceCrud;
    }

    // U- Update
    @RequestMapping("/price_update")
    public String priceUpdate(@RequestParam int newPrice,@RequestParam int index){
        priceCrud.set(index,newPrice);
        return newPrice+" update successfully";
    }

    // D- Delete

    @RequestMapping("/price_delete")

    public String priceDelete(@RequestParam int index){
        priceCrud.remove(index);
        return  " deleted successfully";
    }


}
