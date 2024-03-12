package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.entity.EmployeeNew;
import com.example.demospringbootproject.service.EmployeeNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeNewDbController {
    @Autowired
    EmployeeNewService service;

    @PostMapping("/add_emp")
    public String add(@RequestBody EmployeeNew employee) {
        return service.add(employee);
    }

    @GetMapping("/employees")
    public List<EmployeeNew> getAllEmployee() {
        return service.getAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public EmployeeNew getEmployeeById(@PathVariable Long id) {
        return service.getEmployeeById(id);

    }

    @PutMapping("/update_employee_name/{name}/{id}")
    public String updateEmployeeName(@PathVariable String name, @PathVariable long id) {
        return service.updateName(name, id);

    }

    @PutMapping("/update_Age/{age}/{id}")
    public String updateAge(@PathVariable int age, @PathVariable long id) {
        return service.updateAge(age, id);
    }

    @PutMapping("/update_CityName/{cityName}/{id}")
    public String updateCityName(@PathVariable String cityName, @PathVariable long id) {
        return service.updateCity(cityName, id);
    }

    @DeleteMapping("/remove_Employee/{id}")
    public String removeEmployee(@PathVariable long id) {
        return service.removeEmployee(id);

    }
    @GetMapping("/find_by_id")
    public EmployeeNew findEmployeeById(@RequestParam long id){
        return service.getEmployeeById(id);
    }
    @GetMapping("/find_by_name")
    public EmployeeNew findEmployeeByName(@RequestParam String name){
        return  service.getEmployeeByName(name);

    }
    @GetMapping("/find_by_city_name")
    public  EmployeeNew findEmployeeByCityAndName(@RequestParam String city,@RequestParam String name){
        return  service.getEmployeeByCityAndName(city, name);
    }

}
