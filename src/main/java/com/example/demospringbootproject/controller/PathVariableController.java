package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {
//@RequestMapping("endpoint_name/{pathvariable_name}")
//(@PathVariable Datatype varName)
    @RequestMapping("/welcome_msg/{name}")
    public String welcome(@PathVariable String name){

        return "Welcome to Path variable "+name;
    }

    @RequestMapping("/vote/{age}/{city}")
    public String voting(@PathVariable int age,@PathVariable String city){

        if(age>=18 && city.equals("Pune")){

            return "Eligible for voting in Pune...";
        }else {
            return "NOT Eligible for voting in Pune...";

        }

    }

}
