package com.example.demospringbootproject.controller.test_18Feb_23;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ques1 {
    //Write an endpoint ,which will return String of output with number between 1 to 100
    //whether given number is even or odd.like 1 is odd 2 is even 3 is odd 4 is even.

    @GetMapping("/Number")
    public String num() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i+" Number is Even");
            } else {
                System.out.println(i+" Number is Odd");

            }
        }
        return "Number between 1 to 100";

    }
}
