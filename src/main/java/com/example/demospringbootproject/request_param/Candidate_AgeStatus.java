package com.example.demospringbootproject.request_param;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Candidate_AgeStatus {

    @RequestMapping("/ageStatus")
    public String  candidateAgeStatus(@RequestParam int age) {
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


