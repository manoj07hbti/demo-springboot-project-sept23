package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class EmployeeCRUD {
    ArrayList<Employee> employees= new ArrayList<>();


    @RequestMapping("/add_emp/{name}/{id}/{age}/{dept}")
    public String add_emp(@PathVariable String name,
                         @PathVariable int id,
                         @PathVariable int age,
                         @PathVariable String dept){

        Employee employee=new Employee(name,id,age,dept);
        employees.add(employee);
        return "Employee Added Successfully...";

    }

    @RequestMapping("/get_emp")
    public ArrayList<Employee> getEmployees()
    {
        return employees;

    }

    @RequestMapping("/update_employeeName")
    public String update_emp(@RequestParam String newName, @RequestParam int index){
        Employee employee= employees.get(index);
        employee.setName(newName);
        return "Employee Name updates Successfully...";

    }
    @RequestMapping("/delete_employeeName")
    public String delete_emp(@RequestParam int index){
        employees.remove(index);
        return "Employee Name Deleted Successfully...";
    }

}
