package com.example.demospringbootproject.controller.test_18Feb_23;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ques6 {
    //Write a Endpoint, to print even and odd number
    // between 231 to 333 and also print only those number which is divisible by 5
    @GetMapping("/number/{num}")
    public String number(@PathVariable int num) {
        for (int i= 231; 231 <= 333; i++) {
            if (num % 2 == 0 && num % 5 == 0) {
                return num + " is divisible by 5 and it's an even number.";
            } else if (num % 2 == 0) {
                return num + " is an even number, but not divisible by 5.";
            } else if (num % 5 == 0) {
                return num + " is divisible by 5, but it's an odd number.";
            } else {
                return num + " is an odd number and not divisible by 5.";
            }

        }
    }
}
