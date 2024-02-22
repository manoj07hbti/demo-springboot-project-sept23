package com.example.demospringbootproject.controller.test_18Feb_23;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ques5 {
    // Write a Endpoint, to check whether given number is  prime number or not.
    @GetMapping("/prime_Num/{num}")
    public boolean primeNum(@PathVariable int num) {
        if (num == 0 || num == 1) {
            System.out.println("0 and 1 are not prime ");
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(" The number " + num + " is not prime");
                return false;
            }
        }
        System.out.println(" The number " + num + " is prime");
        return true;
    }
}
