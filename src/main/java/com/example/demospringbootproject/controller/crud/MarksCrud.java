package com.example.demospringbootproject.controller.crud;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class MarksCrud {
    ArrayList<String> Marks=new ArrayList<>();
    @RequestMapping("/Marks_Add/{mark}")
    public String MarksAdd(@PathVariable String mark){
        Marks.add(mark);
    return mark + "Marks Add successfully";
    }
    @RequestMapping("/Read_Marks")
    public ArrayList<String> getMarks(){return Marks;}

    @RequestMapping("/Update_Method")
    public String updateMethod(@RequestParam String marks,@RequestParam int index){
        Marks.set(index,marks);
        return marks + "Marks Update successfully";
    }
    @RequestMapping("/Delete_Method")
    public String delete (@RequestParam int index){
        Marks.remove(index);
        return " Marks delete successfully";
    }

}
