package com.example.demospringbootproject.controller.controllersimple.model;

public class Student {

    String name;

    int age;
    int RollNo;
    String Section;

    public Student(String name, int age, int rollNo, String section) {
        this.name = name;
        this.age = age;
        RollNo = rollNo;
        Section = section;
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

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }
}
