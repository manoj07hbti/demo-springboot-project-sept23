package com.example.demospringbootproject.ControllerAssignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeNumber {
    @RequestMapping("/PrimeNumber")
    public boolean Prime(){
        int n=13;
        if (n==0 || n==1){
            System.out.println("0 and 1 are not prime ");
            return false;
        }
        for (int i=2;i<n;i++){
            if(i%n==0){
                System.out.println(" The number "+n+" is not prime");
                return false;
            }
        }
        System.out.println(" The number " +n+" is prime");
        return true;
    }
}