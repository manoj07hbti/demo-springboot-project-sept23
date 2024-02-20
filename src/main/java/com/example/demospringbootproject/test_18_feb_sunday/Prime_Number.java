package com.example.demospringbootproject.test_18_feb_sunday;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Prime_Number {

    @GetMapping ("/primeNumber")
    public String checkPrimeNumber(@RequestParam int number) {

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return ("Number is not prime" +number);
            }
        }

        return "Number is prime :" + number;

    }


}
