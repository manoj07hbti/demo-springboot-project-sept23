package com.example.demospringbootproject.pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalC {
    @RequestMapping("/add/{a}/{b}")
    public int add(@PathVariable int a,@PathVariable int b){
        int sum=a+b;
        return sum;
    }
    @RequestMapping("sub/{a}/{b}")
    public int sub(@PathVariable int a,@PathVariable int b){
        int sum=a-b;
        return sum;
    }
    @RequestMapping("/multi/{a}/{B}")
    public int multi(@PathVariable int a,@PathVariable int b){
        int sum=a*b;
        return sum;
    }
    @RequestMapping("div/{a}/{b}")
    public double division(@PathVariable double a,@PathVariable double b){
        double divide=(double)a/b;
        return divide;
    }
}
