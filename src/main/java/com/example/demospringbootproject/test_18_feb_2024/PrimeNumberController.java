package com.example.demospringbootproject.test_18_feb_2024;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class PrimeNumberController {

        @GetMapping("/checkPrime")
        public String checkPrime(@RequestParam int number) {
            if (number <= 1) {
                return number + " is not a prime number";
            }
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return number + " is not a prime number";
                }
            }
            return number + " is a prime number";
        }
    }
