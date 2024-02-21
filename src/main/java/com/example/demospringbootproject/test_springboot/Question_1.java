package com.example.demospringbootproject.test_springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question_1 {
    //Q1- Write a Endpoint, which will return String of output with number between 1 to 100  whether given number is even or odd.
    //like 1 is odd 2 is even 3 is odd 4 is even
    @RequestMapping("/check")
    public String even_odd(@RequestParam int a) {

        if (a < 1 || a > 100) {
            return "number type between 1 to 100";
        } else if (a % 2 == 0) {
            return a + " is even number";
        } else {
            return a + " is odd number";
        }
    }

}
