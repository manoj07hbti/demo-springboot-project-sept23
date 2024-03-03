package com.example.demospringbootproject.repository;

import com.example.demospringbootproject.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorEntity,Long> {
}
