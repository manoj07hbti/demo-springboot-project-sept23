package com.example.demospringbootproject.repository;

import com.example.demospringbootproject.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {
    public Doctor findByName(String name);
    public Doctor findBySpecialization(String specialization);
    public Doctor findByNameAndSpecialization(String name,String specialization);
    public Doctor findByIdAndSpecialization(long Id,String specialization);
    public Doctor findByIdAndName(long Id,String name);

}
