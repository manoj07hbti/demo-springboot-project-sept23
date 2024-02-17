package com.example.demospringbootproject.controller.crud;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CountryCrud {
    ArrayList<String> Name = new ArrayList<>();
    @PostMapping("/Add_Country/{name}")
    public String AddCountry (@PathVariable String name) {
        Name.add(name);
        return name + " add successfully ";
    }
    @GetMapping("/Read_Country")
    public ArrayList<String> ReadName() {return Name;}

    @PutMapping("/Update_Name")
    public String updateName (@RequestParam String name, @RequestParam int index){
       Name.set(index, name);
       return name + "update successfully";
    }

    @DeleteMapping("Delete_Country")
    public String DeleteName(@RequestParam int index){
       Name.remove(index);
       return "Name deleted successfully ";
    }
}
