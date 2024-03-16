package com.example.demospringbootproject.ControllerAssignment;

import com.example.demospringbootproject.Service.EmployeeNewService;
import com.example.demospringbootproject.entity.EmployeeNew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    public class EmployeeController {
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

    }
