package com.example.demospringbootproject.test_18_feb_sunday;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOdd_Number {

    @RequestMapping("/evenOddNum")
    public String evenOddNumber() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println  (i + " ...is even number");
            } else {
                System.out.println (i + " ...is odd number");
            }
        }
        return "Even and Odd number" ;
    }

}
