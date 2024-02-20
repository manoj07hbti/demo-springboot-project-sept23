package com.example.demospringbootproject.controller.feb18_test;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatePercentage {
    @RequestMapping("/Calculate_Percentage")
    public String CalcPer (@RequestParam double number, @RequestParam double Percentage){
      double result=(Percentage/100)*number;
        return "The Percentage of number is " + result + " % ";

    }
}
