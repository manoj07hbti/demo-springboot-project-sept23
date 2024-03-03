package com.example.demospringbootproject.controller.controllerapp;

import com.example.demospringbootproject.entity.EngineerEntity;
import com.example.demospringbootproject.service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EngineerController {
    @Autowired
    EngineerService service;
    @PostMapping("/Engineer_Add")
    public String engineerData(@RequestBody EngineerEntity engineerEntity){
       return service.dataAdding(engineerEntity);
    }
    @GetMapping("/Eng_Read_Data")
    public List<EngineerEntity> readEng(EngineerEntity engineerEntity){
        return service.dataEng(engineerEntity);
    }

    @GetMapping("/Get_by_id/{id}")
    public EngineerEntity gettingData(@PathVariable Long id){
        return service.getID(id);
    }

}
