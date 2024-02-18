package com.example.demospringbootproject.crud;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Marks {
    //CRUD

    ArrayList<Integer> marks=new ArrayList<>();

    //CREATE OR ADD
    @RequestMapping("/Add/{mark}")
    public String add(@PathVariable int mark){
        marks.add(mark);
        return mark+" :added successfully";
    }
    //READ
    @RequestMapping("/read")
    public ArrayList<Integer> read(){

        return marks;
    }
    //UPDATE
    @RequestMapping("/update")
    public String update(@RequestParam int mark,@RequestParam int index){
        marks.set(index,mark);
        return mark+"update successfully";
    }
    @RequestMapping("/delete")
    public String delete(@RequestParam int index){
        marks.remove(index);
        return "delete successfully";

    }
}
