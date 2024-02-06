package com.example.demospringbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Even_Odd {

    @RequestMapping("/evenOdd")
    public void checkEvenOdd() {
        int number=8;
            if (number % 2 == 0) {
                System.out.println(number + " ...is even number");
            } else {
                System.out.println(number+ " ...is odd number");
            }
        }
    }

