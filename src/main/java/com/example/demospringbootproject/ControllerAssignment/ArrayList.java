package com.example.demospringbootproject.ControllerAssignment;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayList
{
    @RequestMapping("/BrandNames")
    public String[] arr(){
        String[] brands={"Netflix","Apple","Google","Spotify","Microsoft","Pinterest","Twitter","Meta"};
        System.out.println("we have the brand names");
        return brands;

    }
}
