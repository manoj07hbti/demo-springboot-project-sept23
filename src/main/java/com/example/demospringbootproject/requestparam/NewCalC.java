package com.example.demospringbootproject.requestparam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewCalC {
    @RequestMapping("/ad")
    public int add(@RequestParam int a,@RequestParam int b){
        int sum=a+b;
        return sum ;
    }
    @RequestMapping("/subtract")
    public int sub(@RequestParam int a,@RequestParam int b){
        int sum=a-b;
        return sum;
    }
    @RequestMapping("/count")
    public int multiple(@RequestParam int a,@RequestParam int b){
        int sum=a*b;
        return sum;
    }
    @RequestMapping("/trio")
    public double divide(@RequestParam double a,@RequestParam double b){
        double result=(double)a/b;
        return result;
    }
}
