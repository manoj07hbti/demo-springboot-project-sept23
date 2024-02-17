package com.example.demospringbootproject.controller.controllersimple.model;

public class Employee {

    String emid;
    String name;
    int age;
    String dep;

    public Employee(String emid, String name, int age, String dep) {
        this.emid = emid;
        this.name = name;
        this.age = age;
        this.dep = dep;
    }

    public String getEmid() {
        return emid;
    }

    public void setEmid(String emid) {
        this.emid = emid;
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

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
}
