package com.example.demospringbootproject.controller.crud;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class MarksCrud {
    ArrayList<String> Marks=new ArrayList<>();
    @PostMapping("/Marks_Add/{mark}")
    public String MarksAdd(@PathVariable String mark){
        Marks.add(mark);
    return mark + "Marks Add successfully";
    }
    @GetMapping("/Read_Marks")
    public ArrayList<String> getMarks(){return Marks;}

    @PutMapping("/Update_Method")
    public String updateMethod(@RequestParam String marks,@RequestParam int index){
        Marks.set(index,marks);
        return marks + "Marks Update successfully";
    }
    @DeleteMapping("/Delete_Method")
    public String delete (@RequestParam int index){
        Marks.remove(index);
        return " Marks delete successfully";
    }

}
