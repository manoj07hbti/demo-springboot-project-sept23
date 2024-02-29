package com.example.demospringbootproject.controller.reqparam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ArmstrongNumReqParam {
    @RequestMapping("/ArmstrongNumber")
    public boolean armstrongNum(@RequestParam int n) {
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
