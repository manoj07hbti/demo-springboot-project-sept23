package com.example.demospringbootproject.model;

import org.springframework.web.bind.annotation.RestController;
public class Library {

    String name;
    String subject;
    String writer;
    String allocationStatus;

    // P C

    public Library(String name, String subject, String writer, String allocationStatus) {
        this.name = name;
        this.subject = subject;
        this.writer = writer;
        this.allocationStatus = allocationStatus;
    }
    // G and S


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getAllocationStatus() {
        return allocationStatus;
    }

    public void setAllocationStatus(String allocationStatus) {
        this.allocationStatus = allocationStatus;
    }
}
