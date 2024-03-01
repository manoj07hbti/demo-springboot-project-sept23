package com.example.demospringbootproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctor_Entity {
    @Id
    @GeneratedValue
    long DocID;
    String name;
    int age;
    String department;


    public Doctor_Entity() {
    }

    public long getDocID() {
        return DocID;
    }

    public void setDocID(long docID) {
        DocID = docID;
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
}
