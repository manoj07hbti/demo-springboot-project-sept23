package com.example.demospringbootproject.crud;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class Marks {
    //CRUD

    ArrayList<Integer> marks=new ArrayList<>();

    //CREATE OR ADD
    @PostMapping("/Add/{mark}")
    public String add(@PathVariable int mark){
        marks.add(mark);
        return mark+" :added successfully";
    }
    //READ
    @GetMapping("/read")
    public ArrayList<Integer> read(){

        return marks;
    }
    //UPDATE
    @PutMapping("/update")
    public String update(@RequestParam int mark,@RequestParam int index){
        marks.set(index,mark);
        return mark+"update successfully";
    }
    @DeleteMapping("/delete")
    public String delete(@RequestParam int index){
        marks.remove(index);
        return "delete successfully";

    }
}
