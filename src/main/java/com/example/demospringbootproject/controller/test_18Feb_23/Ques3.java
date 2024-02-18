package com.example.demospringbootproject.controller.test_18Feb_23;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ques3 {
    // Write a Endpoint, take input as String and check whether given String is Palindrome or not (A string is called
    // a palindrome string if the reverse of that string is the same as the original string. For example, radar, level, etc)
   @GetMapping("/palindromeString/{str}")
    public String palindrome(@PathVariable String str) {
        String oringinalStr = str;
        String reversedStr="";
        int strLength = str.length();
        for (int i = strLength - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }
        if (oringinalStr.toLowerCase().equals(reversedStr.toLowerCase())) {
            return str + " is a Palindrome String";
        } else {
            return str + " is not Palindrome String";
        }
    }
}
