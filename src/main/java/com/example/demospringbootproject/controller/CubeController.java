package com.example.demospringbootproject.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CubeController {
 //http://localhost:PORT_NUMBER/ENDPOINT_NAME

    @RequestMapping("/cubemethod")
    public String cubemethod(){
        int number =5;
        return number * number * number + " Printing the cube of " + number;
    }
}
