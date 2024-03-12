package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.Employee;
import com.example.demospringbootproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;
    public String add(Employee employee){
        repository.save(employee);
        return "employee added successfully";
    }
    public List<Employee>getAllEmployee(){
     return    repository.findAll();
    }
    public Employee getEmployeeById(Long id){
        return repository.getById(id);
    }
}
