package com.example.demospringbootproject.crud;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class Country {

    public ArrayList<String> countries=new ArrayList<>();

    @PostMapping("/added/{country}")
    public String add(@PathVariable String country){
        countries.add(country);
        return country+" :added successfully";

    }
    @GetMapping("/countries")
    public ArrayList<String> read(){

        return countries;
    }
    @PutMapping("/update_name")
    public String update(@RequestParam String country,@RequestParam int index){
        countries.set(index,country);
        return "updated successfully";
    }
    @DeleteMapping("/delete_name")
    public String delete(int index){
        countries.remove(index);
        return "delete successfully";
    }
}
