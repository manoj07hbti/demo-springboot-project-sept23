package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.EmployeeNew;
import com.example.demospringbootproject.repository.EmployeeNewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeNewService {
    @Autowired
    EmployeeNewRepository repository;

    public String add(EmployeeNew employee) {
        repository.save(employee);
        return "Employee Added Successfully..";
    }

    public List<EmployeeNew> getAllEmployees() {
        return repository.findAll();

    }

    public EmployeeNew getEmployeeById(Long id) {
        return repository.getById(id);
    }

    public String updateName(String name, long id) {
        EmployeeNew employee = repository.getById(id);
        employee.setName(name);
        repository.save(employee);
        return "Employee Name Updated Successfully.. " + name;
    }

    public String updateAge(int age, long id) {
        EmployeeNew employee = repository.getById(id);
        employee.setAge(age);
        repository.save(employee);
        return "Employee Age Updated Successfully.. " + age;
    }

    public String updateCity(String cityName, long id) {
        EmployeeNew employee = repository.getById(id);
        employee.setCity(cityName);
        repository.save(employee);
        return "Employee City Updated Successfully.. " + cityName;
    }

    public String removeEmployee(long id) {
        repository.deleteById(id);
        return "Employee Record Deleted Successfully..";
    }
    public EmployeeNew getEmployeeById(long id){

        return repository.findById(id);
    }
    public EmployeeNew getEmployeeByName(String name){
        return  repository.findByName(name);
    }
    public EmployeeNew getEmployeeByCityAndName(String city,String name){
        return repository.findByCityAndName(city, name);
    }
}
