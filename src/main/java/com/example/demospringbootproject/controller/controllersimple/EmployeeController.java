package com.example.demospringbootproject.controller.controllersimple;

import com.example.demospringbootproject.controller.controllersimple.model.Employee;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.util.ArrayList;
@RestController
public class EmployeeController {
    ArrayList<Employee> employees= new ArrayList<>();
    @PostMapping("/Employee_Added")
    public String EmployeeAdd(@RequestParam String empid,@RequestParam String name,@RequestParam int age,@RequestParam String dep){
        Employee employee= new Employee(empid,name,age,dep);
        employees.add(employee);
        return " Employee data added successfully ";
    }
    @GetMapping("Read_Employees")
    public ArrayList<Employee> Readdata(){return employees;}

    @PutMapping("Update_Data")
    public String Updatedata (@RequestParam String name,@RequestParam int index){
        Employee employee=employees.get(index);
        employee.setName(name);
        return " Name update successfully ";
    }

    @DeleteMapping("Delete_name")
    public String Deletename(int index){
        employees.remove(index);
        return " Name deleted successfully ";
    }
}
