package com.example.demospringbootproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctor
{
    @Id
    @GeneratedValue
    long highriseIdNumber;
    String name;
    String speciality;
    int fees;
    String city;

    public Doctor() {
    }

    public long getHighriseIdNumber() {
        return highriseIdNumber;
    }

    public void setHighriseIdNumber(long highriseIdNumber) {
        this.highriseIdNumber = highriseIdNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
