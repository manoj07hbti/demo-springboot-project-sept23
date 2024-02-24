package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.Employee_Entity;

import com.example.demospringbootproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


import javax.swing.text.html.parser.Entity;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;

    public String addEmployee(Employee_Entity employee) {
        repository.save(employee);
        return "Employee added successfully";
    }

    public List<Employee_Entity> readEmployee() {
        return repository.findAll();
    }

    public Employee_Entity readEmployeeById(Long id) {
        return repository.getById(id);
    }

    public String updateEmployeeName(String name, long id) {
        Employee_Entity employee = repository.getById(id);
        employee.setName(name);
        repository.save(employee);
        return "Name updated successfully" + name;

    }


    public String updateAge(int age, Long id) {
        Employee_Entity employee = repository.getById(id);
        employee.setAge(age);
        repository.save(employee);
        return "Age updated successfully" + age;


    }

    public String updateCity(String city, Long id) {
        Employee_Entity employee = repository.getById(id);
        employee.setCity(city);
        repository.save(employee);
        return "City updated successfully" + city;

    }

    public String delete( @RequestParam long id) {
        repository.deleteById(id);
        return "Deleted successfully";
    }
}



