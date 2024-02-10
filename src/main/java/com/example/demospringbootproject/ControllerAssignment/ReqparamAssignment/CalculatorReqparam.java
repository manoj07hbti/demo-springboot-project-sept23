package com.example.demospringbootproject.ControllerAssignment.ReqparamAssignment;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorReqparam {
    @RequestMapping("/Addition")
    public int add(@RequestParam int x, @RequestParam int y)
    {
        return x + y;
    }
    @RequestMapping("/Subtraction")
    public int sub(@RequestParam int x, @RequestParam int y)
    {
        return x-y;
    }
    @RequestMapping("/Multiplication")
    public int multiply(@RequestParam int x,@RequestParam int y)
    {
        return x*y;
    }
    @RequestMapping("/Division")
    public double div(@RequestParam double x,@RequestParam double y)
    {
        return (double) x/y;
    }
}