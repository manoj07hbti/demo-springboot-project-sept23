package com.example.demospringbootproject.test_18_feb_2024;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromeController {

    @GetMapping("/checkPalindrome")
    public String checkPalindrome(@RequestParam String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return input + " is not a palindrome";
            }
            left++;
            right--;
        }

        return input + " is a palindrome";
    }
}
