package com.example.demospringbootproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Engineer {
    @Id
    @GeneratedValue
    long RollNo;
    String name ;
    int age;
    String degree;
    String subject;

    public Engineer() {

    }

    public Engineer(long rollNo, String name, int age, String degree, String subject) {
        RollNo = rollNo;
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.subject = subject;
    }

    public long getRollNo() {
        return RollNo;
    }

    public void setRollNo(long rollNo) {
        RollNo = rollNo;
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

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

