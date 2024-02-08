package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ArrayStringController {

    @RequestMapping("/Array_List")
    public String ArrayList(){
        ArrayList<String> list=new ArrayList<>();

        list.add("Jockey");
        list.add("Mufti");
        list.add("Jack & Jones");
        list.add("Allen");
        list.add("Nike");
        return list + "Printing list of brands ";
    }


}
