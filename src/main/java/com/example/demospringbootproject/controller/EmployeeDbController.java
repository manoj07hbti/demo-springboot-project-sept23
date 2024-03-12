package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.entity.Employee;
import com.example.demospringbootproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeDbController {
    @Autowired
    EmployeeService service;
    @PostMapping("/add_emp")
    public String add(Employee employee){
        return service.add(employee);
    }
    @GetMapping("/employee")
    public List<Employee>getAllEmployee(){
        return service.getAllEmployee();
    }
    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return service.getEmployeeById(id);
    }
}
