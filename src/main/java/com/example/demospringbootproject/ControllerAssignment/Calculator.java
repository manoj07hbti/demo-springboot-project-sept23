package com.example.demospringbootproject.ControllerAssignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
    @RestController
    public class Calculator {
        int x = 5;
        int y = 3;

        @RequestMapping("/addition")
        public int add() {
            int sum = x + y;
            System.out.println(sum+ " is the addition of x and y");
            return sum;
        }

        @RequestMapping("/subtraction")
        public int sub() {
            int diff = x - y;
            System.out.println(diff+ " is the subtraction of x and y");
            return diff;
        }

        @RequestMapping("/multiplication")
        public int multi() {
            int multiply = x * y;
            System.out.println(multiply+ " is the multiplication of x and y");
            return multiply;
        }

        @RequestMapping("/division")
        public double div() {
            double divide = (double) x / y;
            System.out.println(divide+ " is the division of x and y");
            return divide;

        }
    }

