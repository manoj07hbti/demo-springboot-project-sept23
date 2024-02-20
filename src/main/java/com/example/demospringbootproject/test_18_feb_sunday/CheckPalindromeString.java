package com.example.demospringbootproject.test_18_feb_sunday;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckPalindromeString {

    @RequestMapping("/palindrome")
    public String  revString(@RequestParam String str){
        String reverseStr="";
        int strLength=str.length();

        for (int i=(strLength-1);i>=0;--i){
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())){

            return (str+ " is a Palindrome String");
        }else{
            return (str+ " is not a Palindrome String");
        }
    }
}
