package com.example.demospringbootproject.controller.model;

public class Student {
    String name;
    int age;
    int id;
    String emailId;

    public Student(String name, int age, int id, String emailId) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.emailId = emailId;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
