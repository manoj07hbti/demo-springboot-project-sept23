package com.example.demospringbootproject.request_param;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Check_Even_Odd {

    @RequestMapping("/eveOdd")
    public String findEvenOdd(@RequestParam int number) {

        if (number % 2 == 0) {
            return number + " ...is even number";
        } else {
            return number+ " ...is odd number";
        }
    }
}
