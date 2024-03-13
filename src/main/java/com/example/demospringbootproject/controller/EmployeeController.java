package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.entity.Employee_Entity;

import com.example.demospringbootproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping("/add_employee")
    public String addEmployee(@RequestBody Employee_Entity employee) {
        return service.addEmployee(employee);

    }

    @GetMapping("/read_employee")
    public List<Employee_Entity> readEmployee() {
        return service.readEmployee();
    }

//  Find employee by Id
    @GetMapping("/read_employeeId")
    public Employee_Entity readEmployeeById(@RequestParam Long id) {
        return service.readEmployeeById(id);

    }

    @PutMapping("/update_empName")
    public String updateEmployeeName(@RequestParam String name, @RequestParam long id) {
        return service.updateEmployeeName(name, id);
    }

    @PutMapping("/update_empAge")
    public String  updateAge(@RequestParam int age, @RequestParam long id) {
        return service.updateAge(age, id);

    }

    @PutMapping("/update_empCity")
    public String updateCity(@RequestParam String city, @RequestParam long id) {
        return service.updateCity(city,id);
    }

    @DeleteMapping("/delete_employee")
    public String delete( @RequestParam long id) {
        return service.delete(id);
    }


    // Find employee by Name
    @GetMapping("/read_name")
    public Employee_Entity getByName(@RequestParam String name){
        return service.getByName(name);
    }

    // Find employee by name and city

    @GetMapping("/read_name_city")
    public Employee_Entity getByNameAndCity(@RequestParam String name,@RequestParam String city){
        return service.getByNameAndCity(name,city);
    }
}