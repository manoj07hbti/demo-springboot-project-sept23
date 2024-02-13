package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    //C
    ArrayList<Employee> employees= new ArrayList<>();

    //TODO use request param and path variable and get all the data from browser then create object
    @PostMapping("/add_emp")
    public String addEmp(){

        Employee employee= new Employee("Ab1","Rahul",25,"CS");

        employees.add(employee);

        return "Employee Added Successfully...";

    }

    //R
    @GetMapping("get_all_emp")
    public ArrayList<Employee> getEmployees(){
        return employees;
    }

    @PutMapping("/update_emp_name")
    public String updateEmp(@RequestParam String newName, @RequestParam int index){
        // find employee

       Employee employee= employees.get(index);
       employee.setName(newName);

       return "Employee Name updates Successfully...";

    }
    @DeleteMapping("/delete_emp")
    public String delete(@RequestParam int index){
        employees.remove(index);
        return "Record Deleted Successfully...";
    }

}
