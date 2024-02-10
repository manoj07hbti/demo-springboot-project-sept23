package com.example.demospringbootproject.ControllerAssignment.ReqparamAssignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class AgestatusReqparam
    {
        @RequestMapping("/AgeStatus")//http://localhost:PORT_NUMBER/ENDPOINT_NAME
        public String status(@RequestParam int age) {
            if (age < 18) {
                return "candidate is a Child and have age: "+age;
            } else if (45 > age && age > 18) {
                return "candidate is Young and have age: "+age;
            } else if (age > 45) {
                return "candidate is Old and have age: "+age;
            }
            return "Candidates Age Status completed";
        }
    }
