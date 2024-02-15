package com.example.demospringbootproject.pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Even_oddNumber {

    @RequestMapping("/evenOdd/{num}")
    public String evenOdd(@PathVariable int num) {

        if (num % 2 == 0) {
            return "this number is even number";
        } else {
            return "this number is odd number";
        }


    }
}
