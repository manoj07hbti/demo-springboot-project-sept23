package com.example.demospringbootproject.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@JsonSerialize
@Entity
public class Student_Demo {

    @Id
     @GeneratedValue
    long id;
    String name;
    int age ;
    int rollNo;

    public Student_Demo() {
    }

    public Student_Demo(long id, String name, int age, int rollNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
