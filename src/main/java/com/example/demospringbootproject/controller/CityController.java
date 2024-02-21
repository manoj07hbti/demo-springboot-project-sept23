package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.controller.model.City;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class CityController {
    ArrayList<City> cities = new ArrayList<>();

    @PostMapping("/add_city")
    public String addCity(@RequestBody City city) {
        cities.add(city);
        return "City Added Successfully...";
    }

    @GetMapping("/get_city")
    public ArrayList<City> getCities() {
        return cities;
    }

    @PutMapping("/update_City")
    public String updateCity(@RequestParam String newName, @RequestParam int index) {
        City city = cities.get(index);
        city.setCityName(newName);
        return "City Name updated Successfully...";
    }

    @DeleteMapping("/delete_City")
    public String deleteCity(@RequestParam int index) {
        cities.remove(index);
        return "City Name Deleted Successfully...";
    }
}
