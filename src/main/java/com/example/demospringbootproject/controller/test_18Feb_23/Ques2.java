package com.example.demospringbootproject.controller.test_18Feb_23;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ques2 {
    //Write a Endpoint, which will take input as number ,
    // percentage and calculate percentage of given number
    @GetMapping("/percentage_num/{number}/{percentage}")
    public String num(@PathVariable int number, @PathVariable double percentage) {
        percentage = number * percentage / 100;
        return "Percentage of " + number + " is " + percentage;
    }
}
