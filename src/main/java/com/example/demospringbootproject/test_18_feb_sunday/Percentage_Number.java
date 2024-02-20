package com.example.demospringbootproject.test_18_feb_sunday;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Percentage_Number {

    @RequestMapping("/perNum")
    public double percentageNumber(@RequestParam int number, @RequestParam double percentage){

        double per = (double) number * percentage / 100;
        return per;

    }

}
