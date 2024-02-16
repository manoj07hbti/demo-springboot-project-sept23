package com.example.demospringbootproject.crud;

import com.example.demospringbootproject.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeCrud {

    ArrayList<Employee> employeeCrud=new ArrayList<>();
   // @RequestMapping("/add_emp")
    @PostMapping("/add_emp")
    public String addEmployee(@RequestParam String name, @RequestParam int age, @RequestParam String department,@RequestParam String empId){
        Employee employee=new Employee(name,age,department,empId);
        employeeCrud.add(employee);
        return "Employee added successfully";
    }

   // @RequestMapping("/read_emp")
    @GetMapping("/read_emp")

    public ArrayList<Employee> readEmployee(){

        return employeeCrud;
    }

  //  @RequestMapping("/update_emp")
    @PutMapping("/update_emp")
    public String updateEmployee(@RequestParam String newDepartment,@RequestParam int index){
        Employee employee=employeeCrud.get(index);
        employee.setDepartment(newDepartment);
        return "Employee Department Update Successfully";
    }
   // @RequestMapping("/delete_emp")
    @DeleteMapping("/delete_emp")
    public String deleteEmployee(@RequestParam int index){
        employeeCrud.remove(index);
        return "Deleted successfully";

    }

}
