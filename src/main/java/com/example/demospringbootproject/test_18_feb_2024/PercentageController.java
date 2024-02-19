package com.example.demospringbootproject.test_18_feb_2024;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PercentageController {

    @GetMapping("/calculatePercentage")
    public String calculatePercentage(@RequestParam double number, @RequestParam double percentage) {
        double result = (percentage / 100) * number;
        return "Percentage of " + number + " for " + percentage + "% is: " + result;
    }
}
