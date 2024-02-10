package com.example.demospringbootproject.model;

public class Employee {

    String empId;
    String name;
    int age;
    String dept;

    // param constructor


    public Employee(String empId, String name, int age, String dept) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    // getter and setter


    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
