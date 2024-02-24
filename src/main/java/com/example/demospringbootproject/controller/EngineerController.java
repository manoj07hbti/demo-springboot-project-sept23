package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.entity.Engineer_Entity;
import com.example.demospringbootproject.service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EngineerController {

    @Autowired
    EngineerService service;

    @PostMapping("/add_engineer")
    public String addEngineer(@RequestBody Engineer_Entity engineer){
        return service.addEngineer(engineer);

    }

    @GetMapping("/read_engineer")
    public List<Engineer_Entity> readEngineer(){
        return service.readEngineer();
    }

    @GetMapping("/read_engineerId")
    public Engineer_Entity readEngineerById(@RequestParam Long id){
        return service.readEngineerById(id);

    }

}
