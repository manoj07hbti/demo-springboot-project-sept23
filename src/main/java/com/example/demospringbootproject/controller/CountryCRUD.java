package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CountryCRUD {
    ArrayList<String> countries=new ArrayList<>();
    @PostMapping("/country_add/{countryName}")//http://localhost:PORT_NUMBER/ENDPOINT_NAME
    public String add(@PathVariable String  countryName) {
        countries.add(countryName);
        return countryName+" Country Name Added Successfully!";
    }
    @GetMapping("/country_get")
    public ArrayList<String> getCountries(){
        return countries;
    }
    @PutMapping("/country_update")
    public String update(@RequestParam String countryName, int index){
        countries.set(index,countryName);
        return countryName+" Country Name Updated Successfully!";
    }
    @DeleteMapping("/country_delete")
    public String delete(@RequestParam int index){
        countries.remove(index);
        return " Country Name Deleted Successfully!";
    }
}
