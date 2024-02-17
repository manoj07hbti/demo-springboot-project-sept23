package com.example.demospringbootproject.controller.crud;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CountryCrud {
    ArrayList<String> Name = new ArrayList<>();
    @RequestMapping("/Add_Country/{name}")
    public String AddCountry (@PathVariable String name) {
        Name.add(name);
        return name + " add successfully ";
    }
    @RequestMapping("/Read_Country")
    public ArrayList<String> ReadName() {return Name;}

    @RequestMapping("/Update_Name")
    public String updateName (@RequestParam String name, @RequestParam int index){
       Name.set(index, name);
       return name + "update successfully";
    }

    @RequestMapping("Delete_Country")
    public String DeleteName(@RequestParam int index){
       Name.remove(index);
       return "Name deleted successfully ";
    }
}
