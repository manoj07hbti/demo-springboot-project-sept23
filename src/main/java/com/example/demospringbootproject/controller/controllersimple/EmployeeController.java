package com.example.demospringbootproject.controller.controllersimple;

import com.example.demospringbootproject.controller.controllersimple.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;
import java.util.ArrayList;
@RestController
public class EmployeeController {
    ArrayList<Employee> employees= new ArrayList<>();
    @RequestMapping("/Employee_Added")
    public String EmployeeAdd(@RequestParam String empid,@RequestParam String name,@RequestParam int age,@RequestParam String dep){
        Employee employee= new Employee(empid,name,age,dep);
        employees.add(employee);
        return " Employee data added successfully ";
    }

    @RequestMapping("Read_Employees")
    public ArrayList<Employee> Readdata(){return employees;}

    @RequestMapping("Update_Data")
    public String Updatedata (@RequestParam String name,@RequestParam int index){
        Employee employee=employees.get(index);
        employee.setName(name);
        return " Name update successfully ";
    }

    @RequestMapping("Delete_name")
    public String Deletename(int index){
        employees.remove(index);
        return " Name deleted successfully ";
    }
}
