package com.example.demospringbootproject.crud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Country_CRUD {

    ArrayList<String > countryName=new ArrayList<>();

    @RequestMapping("/coun_add")
    public String countryAdd(@RequestParam String country){
        countryName.add(country);
        return country+" added successfully";
    }

    @RequestMapping("/coun_read")
    public ArrayList<String > countryRead(){
        return countryName;
    }

    @RequestMapping("/coun_update")
    public String countryUpdate(@RequestParam String newCountry,@RequestParam int index){
        countryName.set(index,newCountry);
        return newCountry+" added successfully";
    }

    @RequestMapping("/coun_delete")
    public String countryDelete(@RequestParam int index){
        countryName.remove(index);
        return "deleted successfully";
    }

}
