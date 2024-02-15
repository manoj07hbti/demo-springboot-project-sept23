package com.example.demospringbootproject.pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculater_pathvariable {

    @RequestMapping("/addition/{a}/{b}")
    public String add(@PathVariable int a,@PathVariable int b){

        return a+b +" :is a addition";

    }
    @RequestMapping("/subtraction/{a}/{b}")
    public String sub(@PathVariable int a,@PathVariable int b){

        return a-b +"is a subtraction";

    }
    @RequestMapping("/multiply/{a}/{b}")
    public String multi(@PathVariable int a,@PathVariable int b){

        return a*b +"is a multiplication";

    }
    @RequestMapping("/divide/{a}/{b}")
    public String div(@PathVariable int a,@PathVariable int b){

        return (double)a/b +"is a division";

    }

}

