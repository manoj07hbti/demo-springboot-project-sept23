package com.example.demospringbootproject.repository;

import com.example.demospringbootproject.entity.Student_Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student_Entity,Long> {
}
