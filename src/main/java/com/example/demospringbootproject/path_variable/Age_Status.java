package com.example.demospringbootproject.path_variable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Age_Status {

    @RequestMapping("/age/{age}")
    public String  candidateAge(@PathVariable int age) {
        if (age < 18) {
            return "Child";
        } else if (age >= 18 && age < 45) {
            return "Young";
        } else if (age > 45) {
            return "Old";

        }

        return "Age Status";
    }
}
