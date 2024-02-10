package com.example.demospringbootproject.crud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Book {

    ArrayList<String>bookNames=new ArrayList<>();
    @RequestMapping("/book_add")
    public String add(@RequestParam String name){
        bookNames.add(name);
        return name;
    }
    @RequestMapping("/get all")
    public ArrayList<String>getBookNames(){
        return bookNames;
    }
    @RequestMapping("/update_book")
    public String update(@RequestParam String name,@RequestParam int index){
       bookNames.set(index,name);
       return name;
    }
    @RequestMapping("/deleted_book")
    public String delete(@RequestParam int index){
        bookNames.remove(index);
        return "book name deleted";
    }
}
