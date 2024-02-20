package com.example.demospringbootproject.controller.controllersimple.model;

public class Book {

    String Name;
    String Subject;
    String Writer;
    String AllocationStatus;

    public Book(String name, String subject, String writer, String allocationStatus) {
        Name = name;
        Subject = subject;
        Writer = writer;
        AllocationStatus = allocationStatus;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }

    public String getAllocationStatus() {
        return AllocationStatus;
    }

    public void setAllocationStatus(String allocationStatus) {
        AllocationStatus = allocationStatus;
    }
}
