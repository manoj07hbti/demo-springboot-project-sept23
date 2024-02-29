package com.example.demospringbootproject.controller.pathvar;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeStatusPathVar {
    @RequestMapping("/AgeStatus/{age}")//http://localhost:PORT_NUMBER/ENDPOINT_NAME
    public String status(@PathVariable int age) {
        if (age < 18) {
            return "candidate is a Child "+age;
        } else if (45 > age && age > 18) {
            return "candidate is Young "+age;
        } else if (age > 45) {
            return "candidate is Old "+age;
        }
        return "Candidates Age Status completed";
    }
}
