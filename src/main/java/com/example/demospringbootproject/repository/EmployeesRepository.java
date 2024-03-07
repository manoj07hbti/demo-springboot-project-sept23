package com.example.demospringbootproject.repository;

import com.example.demospringbootproject.entity.EmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<EmployeesEntity,Long> {
}
