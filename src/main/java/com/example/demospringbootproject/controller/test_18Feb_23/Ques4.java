package com.example.demospringbootproject.controller.test_18Feb_23;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
@RestController
public class Ques4 {
    // Write a Endpoint, to calculate ocurrance of number in given array
    //int arr[]={1,2,3,1,4,5,2,3,2,5,5,2,7,8};
    //
    //example : checkOccurrence/3   then output should be 2
    @GetMapping("/checkOccurrenceOfNum")
    public String occurrence(@RequestParam int num) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 2, 5, 5, 2, 7, 8};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }

        return "Occurrence of " + num + " is " + count;
    }
}