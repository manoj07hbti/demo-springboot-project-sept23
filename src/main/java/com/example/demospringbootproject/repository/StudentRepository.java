package com.example.demospringbootproject.repository;

import com.example.demospringbootproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    public Student findByName(String name);//
    public Student findByRollNo(int rollNo);
    public Student findByIdAndName(long id, String name);// select * from student where id=? and name=?

    //@Query(value ="query  :varName1 :varName2",nativeQuery = true)
    //public Student name(@Param("varName1") Datatype varName1 );

    @Query(value = "select * from STUDENT_9PM_SEPT where name =:nameInput",nativeQuery = true)
    public Student findSQL(@Param("nameInput") String nameInput);

}
