package com.example.demospringbootproject.controller.feb18_test;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateOccurrence {
    @RequestMapping("/Calculate_Occur/{num}")
    public String CalculateOccur (@PathVariable int num){
        int [] arr={1,2,3,1,4,5,2,3,2,5,5,2,7,8};
       int tem=0;
       for(int i =0; i<arr.length; i++){
            if(arr[i] ==num){
               tem++;
           }
    }
    return "The Array of Occurrence " +tem;
    }
}
