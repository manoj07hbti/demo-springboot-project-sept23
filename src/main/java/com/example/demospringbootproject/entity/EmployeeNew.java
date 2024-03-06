package com.example.demospringbootproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeNew {
    @Id
    @GeneratedValue
    Long id;

    String name;
    int age;
    String city;
    String dept;

    public EmployeeNew() {
    }

    public EmployeeNew(Long id, String name, int age, String city, String dept) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.dept = dept;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

