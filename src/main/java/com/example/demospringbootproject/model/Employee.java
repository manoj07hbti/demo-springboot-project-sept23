package com.example.demospringbootproject.model;

public class Employee {

    String name;
    int age;
    String department;
    String empId;

    public Employee(String name, int age, String department, String empId) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
}
