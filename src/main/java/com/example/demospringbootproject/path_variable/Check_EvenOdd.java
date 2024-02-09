package com.example.demospringbootproject.path_variable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Check_EvenOdd {

    @RequestMapping("/evenOddNo/{number}")
    public String evenOddNumber(@PathVariable int number) {

        if (number % 2 == 0) {
            return number + " ...is even number";
        } else {
            return number+ " ...is odd number";
        }
    }
}

