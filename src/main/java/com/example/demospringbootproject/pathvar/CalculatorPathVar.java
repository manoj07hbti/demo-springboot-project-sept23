package com.example.demospringbootproject.pathvar;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorPathVar {
    @RequestMapping("/addition/{x}/{y}")
    public int add(@PathVariable int x, @PathVariable int y) {
        return x + y;
    }
    @RequestMapping("/subtraction/{x}/{y}")
    public int sub(@PathVariable int x,@PathVariable int y){
        return x-y;
    }
    @RequestMapping("/multiplication/{x}/{y}")
    public int multiply(@PathVariable int x,@PathVariable int y){
        return x*y;
    }
    @RequestMapping("/division/{x}/{y}")
    public double div(@PathVariable double x,@PathVariable double y){
        return (double) x/y;
    }
}
