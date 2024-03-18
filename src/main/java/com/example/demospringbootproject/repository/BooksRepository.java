package com.example.demospringbootproject.repository;

import com.example.demospringbootproject.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Transactional
@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {
    //@Query(value ="query  :varName1 :varName2",nativeQuery = true)
    //public Student name(@Param("varName1") Datatype varName1 );
    @Query(value = "select * from LIBRARY_MANAGEMENT", nativeQuery = true)
    public List<Books> getAllBooksSQL();

    @Query(value = "select * from LIBRARY_MANAGEMENT where ID=:id ", nativeQuery = true)
    public Books getBookByIdSQL(@Param("id") long id);

    @Modifying
    @Query(value = "UPDATE LIBRARY_MANAGEMENT SET BOOK_NAME=:bookName WHERE ID=:id ", nativeQuery = true)
    public void updateBookNameByIdSQL(@Param("bookName") String bookName, @Param("id") long id);

    @Modifying
    @Query(value = "UPDATE LIBRARY_MANAGEMENT SET STUDENT_NAME =:studentName, ALLOCATION_STATUS ='Yes' WHERE ID =:id ", nativeQuery = true)
    public void allocateBookSQL(@Param("studentName") String studentName, @Param("id") long id);

    @Query(value = "SELECT * FROM LIBRARY_MANAGEMENT WHERE ALLOCATION_STATUS='No'", nativeQuery = true)
    public List<Books> getAvailableBooksSQL();

    @Query(value = "SELECT * FROM LIBRARY_MANAGEMENT WHERE ALLOCATION_STATUS='Yes'", nativeQuery = true)
    public List<Books> getAllocatedBooksSQL();

    @Modifying
    @Query(value = "DELETE  FROM LIBRARY_MANAGEMENT where ID=:id", nativeQuery = true)
    public void removeBookSQL(@Param("id") long id);


}
