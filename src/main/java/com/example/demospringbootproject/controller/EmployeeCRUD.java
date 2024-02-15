package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class EmployeeCRUD {
    ArrayList<Employee> employees= new ArrayList<>();


    @PostMapping("/add_emp/{name}/{id}/{age}/{dept}")
    public String add_emp(@PathVariable String name,
                         @PathVariable int id,
                         @PathVariable int age,
                         @PathVariable String dept){

        Employee employee=new Employee(name,id,age,dept);
        employees.add(employee);
        return "Employee Added Successfully...";

    }

    @GetMapping("/get_emp")
    public ArrayList<Employee> getEmployees()
    {
        return employees;

    }

    @PutMapping("/update_employeeName")
    public String update_emp(@RequestParam String newName, @RequestParam int index){
        Employee employee= employees.get(index);
        employee.setName(newName);
        return "Employee Name updates Successfully...";

    }
   @DeleteMapping("/delete_employeeName")
    public String delete_emp(@RequestParam int index){
        employees.remove(index);
        return "Employee Name Deleted Successfully...";
    }

}
