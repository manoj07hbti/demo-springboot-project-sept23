package com.example.demospringbootproject.repository;

import com.example.demospringbootproject.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Students,Long> {

}
