package com.example.demospringbootproject.crud;

import com.example.demospringbootproject.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Employee_Controller {
    ArrayList<Employee> employees=new ArrayList<>();
    @PostMapping("/add_emp")

    public String add_employee(@RequestParam String name, @RequestParam String empid, @RequestParam int age, @RequestParam String dept){
        Employee employee=new Employee(name, empid, age, dept);

        employees.add(employee);

        return"Employee added successfully";

    }
    @GetMapping("/read_employee")
    public ArrayList<Employee> read_employee(){
        return employees;

    }
    @PutMapping("/update_emp")
    public String update_emp(@RequestParam String newName,@RequestParam int index){
        Employee employee=employees.get(index);
        employee.setName(newName);
        return "updated successfully";
    }
    @DeleteMapping("/delete_emp")
    public String delete_emp(@RequestParam int index){
        Employee employee=employees.remove(index);
        return "delete successfully";

    }
}
