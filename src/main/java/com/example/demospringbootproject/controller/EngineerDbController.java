package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.entity.Engineer;
import com.example.demospringbootproject.service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EngineerDbController {
    @Autowired
    EngineerService service;
    @PostMapping("/Eng_add")
    public String add(@RequestBody Engineer engineer){
        return service.add(engineer);
    }
    @GetMapping("/Engineers")
    public List<Engineer> getAllEngineer(){
        return service.getAllEngineers();
    }
    @GetMapping("/Engineer/{RollNo}")
    public Engineer getEngineerById(@PathVariable Long RollNo){
        return service.getEngineerById(RollNo);

    }
    @PutMapping("/update_engineer_name/{name}/{id}")
    public String updateEngineerName(@PathVariable String name,@PathVariable long id){
        return service.updateName(name,id);
    }
    @DeleteMapping("/remove_engineer/{id}")
    public String removeEngineer(@PathVariable long id){
        return service.removeEngineer(id);
    }
}
