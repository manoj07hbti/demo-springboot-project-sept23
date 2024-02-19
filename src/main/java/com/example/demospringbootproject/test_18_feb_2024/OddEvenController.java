package com.example.demospringbootproject.test_18_feb_2024;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OddEvenController
{
    @GetMapping("/check_OddEven")
    public String checkOddEven(@RequestParam int number) {
        if (number < 1 || number > 100) {
            return "Number should be between 1 and 100";
        } else if (number % 2 == 0) {
            return number + " is even";
        } else {
            return number + " is odd";
        }
    }
}