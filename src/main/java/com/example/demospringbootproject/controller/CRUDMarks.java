package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;

@RestController
public class CRUDMarks {

    // CRUD Marks Application

    java.util.ArrayList<Integer> marks= new ArrayList<>();

    // C - Create or Add

    @RequestMapping("/mark_add/{mark}")
    public String add (@PathVariable int mark){

        marks.add(mark);
        return mark+" Added successfully:";
    }
    // R - Read or Get

    @RequestMapping("/marks")
    public ArrayList<Integer> getMarks (){

        return marks;
    }

    // U - Update
    @RequestMapping("/marks_update")
    public Integer Update(@RequestParam Integer marknumber, @RequestParam Integer index){

        marks.set(index, marknumber);
        return  marknumber;
    }


    // D - Delete

    @RequestMapping("/marks_Delete")
    public Integer Delete (@RequestParam int index){

        marks.remove(index);
        return index;
    }

}
