package com.example.demospringbootproject.repository;

import com.example.demospringbootproject.entity.Book_Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book_Entity,Long> {
}
