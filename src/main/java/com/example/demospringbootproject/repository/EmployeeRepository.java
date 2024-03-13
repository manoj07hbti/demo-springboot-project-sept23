package com.example.demospringbootproject.repository;

import com.example.demospringbootproject.controller.EmployeeController;
import com.example.demospringbootproject.entity.Employee_Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee_Entity,Long > {

    public Employee_Entity findByName(String name);

    public Employee_Entity findByNameAndCity(String name,String city);
}
