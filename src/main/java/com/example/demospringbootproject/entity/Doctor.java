package com.example.demospringbootproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctor {

    @Id
    @GeneratedValue
    long id;


    String name;
    String specialization;
    String dept;
    int yearsOfExperience;

    public Doctor() {
    }

    public Doctor(long id, String name, String specialization, String dept, int yearsOfExperience) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.dept = dept;
        this.yearsOfExperience = yearsOfExperience;
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}