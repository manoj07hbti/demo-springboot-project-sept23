package com.example.demospringbootproject.crud;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

public class Country {

    public ArrayList<String> countries=new ArrayList<>();

    @RequestMapping("/added/{country}")
    public String add(@PathVariable String country){
        countries.add(country);
        return country+" :added successfully";

    }
    @RequestMapping("/countries")
    public ArrayList<String> read(){
        return countries;
    }
    @RequestMapping("/update_name")
    public String update(@RequestParam String country,@RequestParam int index){
        countries.set(index,country);
        return "updated successfully";
    }
    public String delete(int index){
        countries.remove(index);
        return "delete successfully";
    }
}
