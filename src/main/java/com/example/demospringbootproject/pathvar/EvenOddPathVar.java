package com.example.demospringbootproject.pathvar;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EvenOddPathVar {
    @RequestMapping("/EvenOdd/{n}")
    public String evenOdd(@PathVariable int n){
        if (n%2==0){
            return "Its an even number "+n;
        }else {
            return "Its an odd number "+n;
        }
    }
}
