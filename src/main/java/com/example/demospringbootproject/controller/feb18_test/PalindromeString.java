package com.example.demospringbootproject.controller.feb18_test;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromeString {
    /*Write a Endpoint, take input as String and check whether given String is Palindrome or not (A string is
            called a palindrome string if the reverse of that string is the same as the original string.
            For example, radar,level, etc)*/
@RequestMapping("/Check_Palindrome/{name}")
    public String CheckPalindrome (@PathVariable String name){
    String Rev = "";
       for(int i=name.length()-1; i>=0; i--) {
           Rev = Rev + name.charAt(i);
       }
       if(name.equals(Rev)){
          return  "The String is Palindrome " + Rev;
       }else{
           return "Not Palindrome " +Rev;
       }
    }
    }

