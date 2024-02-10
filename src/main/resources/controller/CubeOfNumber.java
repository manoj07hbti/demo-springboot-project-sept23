package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CubeOfNumber {
    @RequestMapping("/cubeOfNum")
    public String cube(){
        int num=2;
        System.out.println(num*num*num);
        return num*num*num + "is a Cube ";
    }

}
