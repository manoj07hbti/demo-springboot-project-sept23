package com.example.demospringbootproject.test_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question_2 {
    //Q2-Write a Endpoint, which will take input as number , percentage and calculate percentage of given number
    @GetMapping("/percentage")
    public String percentage(@RequestParam double percentage, @RequestParam double number) {
        double result = (percentage / 100) * number;
        return "percentage of " + number + " for " + percentage + "% is: " + result;

    }
}
