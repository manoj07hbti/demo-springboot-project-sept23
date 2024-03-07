package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.EmployeesEntity;
import com.example.demospringbootproject.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeesService {
    @Autowired
    EmployeesRepository repository;
    public String addEmployee(EmployeesEntity employee){
        repository.save(employee);
        return "Employee Added Successfully";
    }
    public List<EmployeesEntity> getEmp(EmployeesEntity employee){
      return repository.findAll();

    }
    public EmployeesEntity getByEmp(Long id){
        return repository.getById(id);
    }
    public String updateName(String name, long id){
    EmployeesEntity employee = repository.getById(id);
    employee.setName(name);
    repository.save(employee);
    return "Employee name updated successfully "+name;
    }
    public String updateAge(int age, long id){
        EmployeesEntity employee = repository.getById(id);
        employee.setAge(age);
        repository.save(employee);
        return "Employee Age updated successfully "+age;
    }
    public String updateCity(String city,long id){
    EmployeesEntity employee =repository.getById(id);
        employee.setCity(city);
        repository.save(employee);
        return "Employee city updated successfully "+city;
    }
    public String removeEmp(@PathVariable long id){
    repository.deleteById(id);
    return "Employee data deleted successfully ";
    }
}
