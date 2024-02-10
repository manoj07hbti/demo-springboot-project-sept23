package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOdd {
    @RequestMapping("/EvenOddNumber")
    public void evenOdd() {
        int n = 4;
        if (n % 2 == 0) {
            System.out.println(n + " Number is even");
        } else {
            System.out.println(n + " Number is odd");
        }
    }
}

