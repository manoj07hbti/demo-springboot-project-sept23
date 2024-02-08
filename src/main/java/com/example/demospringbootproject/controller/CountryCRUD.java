package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CountryCRUD {
    ArrayList<String> countries=new ArrayList<>();
    @RequestMapping("country_add/{countryName}")//http://localhost:PORT_NUMBER/ENDPOINT_NAME
    public String add(@PathVariable String  countryName) {
        countries.add(countryName);
        return countryName+" Country Name Added Successfully!";
    }
    @RequestMapping("country_get")
    public ArrayList<String> getCountries(){
        return countries;
    }
    @RequestMapping("/country_update")
    public String update(@RequestParam String countryName, int index){
        countries.set(index,countryName);
        return countryName+" Country Name Updated Successfully!";
    }
    @RequestMapping("/country_delete")
    public String delete(@RequestParam int index){
        countries.remove(index);
        return " Country Name Deleted Successfully!";
    }
}
