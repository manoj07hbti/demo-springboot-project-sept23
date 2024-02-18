package com.example.demospringbootproject.controller.test_18Feb_23;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ques1 {

    @GetMapping("/Number")
    public String num() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i+" Number is Even");
            } else {
                System.out.println(i+" Number is Odd");

            }
        }
        return "NUmber between 1to 100";

    }
}
