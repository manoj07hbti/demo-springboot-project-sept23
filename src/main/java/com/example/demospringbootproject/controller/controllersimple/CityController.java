package com.example.demospringbootproject.controller.controllersimple;

import com.example.demospringbootproject.controller.controllersimple.model.City;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class CityController {

    ArrayList<City>cities=new ArrayList<>();
    @PostMapping("/City_Added")
    public String AddCity (@RequestBody City citie){
      cities.add(citie);
      return "Cities added successfully ";
    }

    @GetMapping("/Read_City")
    public ArrayList<City> Readcity(){return cities;}

    @PutMapping("/Update_city_data/{name}/{index}")
    public String Updatedata (@PathVariable String name, @PathVariable int index){
        City citie= cities.get(index);
        citie.setName(name);
        return "Update city name successfully ";
    }

    @DeleteMapping("/Delete_City/{index}")
    public String Deletedata (@PathVariable int index){
        cities.remove(index);
        return " Data deleted successfully ";
    }
}
