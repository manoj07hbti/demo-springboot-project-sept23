package com.example.demospringbootproject.test_18_feb_2024;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OccurrenceController {

    @GetMapping("/calculateOccurrence")
    public int calculateOccurrence(@RequestParam int[] array, @RequestParam int number) {
        int occurrence = 0;
        for (int num : array) {
            if (num == number) {
                occurrence++;
            }
        }
        return occurrence;
    }
}
