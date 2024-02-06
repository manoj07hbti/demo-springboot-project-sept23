package com.example.demospringbootproject.pathvar;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArmstrongNumPathVar {
    @RequestMapping("/ArmstrongNumber/{n}")
    public boolean armstrongNum(@PathVariable int n) {
        //153=1*1*1+5*5*5+3*3*3=153
        int originalNum = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;

        }
        return sum == originalNum;
    }

}




