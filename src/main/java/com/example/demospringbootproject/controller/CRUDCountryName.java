package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CRUDCountryName {

    // CRUD countryName Application

    java.util.ArrayList<String> countryNames= new java.util.ArrayList<>();

    // C - Create or Add

    @RequestMapping("/countryName_add/{country}")
    public String add (@PathVariable String country){

        countryNames.add(country);
        return country+" Added successfully:";
    }

    // R - Read or Get

    @RequestMapping("/countryName")
    public ArrayList<String> getCountryNames (){

        return countryNames;
    }

    // U - Update
    @RequestMapping("/countryName_update")
    public String Update(@RequestParam String names , @RequestParam int index){

        countryNames.set(index, names);
        return names;
    }

    // D - Delete

    @RequestMapping("/countryName_Delete")
    public String Delete (@RequestParam int index){

        countryNames.remove(index);
        return " countryNames Delete";
    }
}
