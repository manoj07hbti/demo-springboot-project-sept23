package com.example.demospringbootproject.controller.controllerapp;

import com.example.demospringbootproject.controller.controllersimple.model.Employee;
import com.example.demospringbootproject.entity.EmployeesEntity;
import com.example.demospringbootproject.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class EmployeesController {
    @Autowired
    EmployeesService service;
    @PostMapping("/Add_Employee")
    public String addEmployee(@RequestBody EmployeesEntity employee){
        return service.addEmployee(employee);
    }

    @GetMapping("/Get_Employees")
    public List<EmployeesEntity> getEmp(EmployeesEntity employee){
        return service.getEmp(employee);
    }
    @GetMapping("/Get_by_ID/{id}")
    public EmployeesEntity getByEmp(@PathVariable Long id){
        return service.getByEmp(id);
    }

    @PutMapping("/Update_name/{name}/{id}")
    public String updateName(@PathVariable String name, @PathVariable long id){
        return service.updateName(name,id);
    }
    @PutMapping("/Update_age/{age}/{id}")
    public String updateAge(@PathVariable int age, @PathVariable long id){
        return service.updateAge(age,id);
    }
    @PutMapping("/Update_City/{city}/{id}")
    public String updateCity(@PathVariable String city, @PathVariable long id){
        return service.updateCity(city,id);
    }
    @DeleteMapping("/Remove_Employee/{id}")
    public String removeEmp(@PathVariable long id){
       return service.removeEmp(id);
    }

}
