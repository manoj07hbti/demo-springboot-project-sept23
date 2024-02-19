package com.example.demospringbootproject.test_18_feb_2024;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numbers")
public class PrintEvenOddRange {

    @GetMapping("/classify")
    public String classifyNumbers() {
        StringBuilder result = new StringBuilder();

        for (int i = 231; i <= 333; i++) {
            if (i % 2 == 0) {
                result.append("Even number: ").append(i).append("\n");
            } else {
                result.append("Odd number: ").append(i).append("\n");
            }

            if (i % 5 == 0) {
                result.append("Divisible by 5: ").append(i).append("\n");
            }
        }

        return result.toString();
    }
}
