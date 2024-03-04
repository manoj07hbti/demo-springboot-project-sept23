package com.example.demospringbootproject.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepo {
    public String demoRepository(){
        return "Response from repository....";
    }
}
