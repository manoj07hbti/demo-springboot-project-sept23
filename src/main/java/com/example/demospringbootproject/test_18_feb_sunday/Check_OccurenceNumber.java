package com.example.demospringbootproject.test_18_feb_sunday;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Check_OccurenceNumber {

    @GetMapping("/occNum")
    public String occurenceNumber(@RequestParam int number) {

        int array[] = {1, 2, 3, 1, 4, 5, 2, 3, 2, 5, 5, 2, 7, 8};
        int  count=0;
        for (int i=0; i<array.length;i++){
            if(array[i]==number){
                count++;
            }
        }

        return "Occurence is : "+count;


    }


}