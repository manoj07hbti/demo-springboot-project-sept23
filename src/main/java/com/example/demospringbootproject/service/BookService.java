package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.Book_Entity;
import com.example.demospringbootproject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository repository;

    public String addBook( Book_Entity book){
        repository.save(book);
        return "Book added successfully";
    }

    public List<Book_Entity> readBook(){
        return repository.findAll();
    }

    public Book_Entity readBookById( Long id){
        return repository.getById(id);
    }


    public String updateBookName(@RequestParam String bookName, @RequestParam long id) {
        Book_Entity book=repository.getById(id);
        book.setBookName(bookName);
        repository.save(book);
        return "Book name updated successfully" + bookName;

    }


    public List<Book_Entity> availableBooks(){
        List<Book_Entity> allBooks=repository.findAll();
        List<Book_Entity> availableBooks=new ArrayList<>();
        for (int i=0;i<allBooks.size();i++){
            Book_Entity book=allBooks.get(i);
            if(book.getAllocationStatus().equals("No")){
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }


    public List<Book_Entity> allocatedBooks(){
        List<Book_Entity> allBooks=repository.findAll();
        List<Book_Entity> allocatedBooks=new ArrayList<>();
        for (int i=0;i<allBooks.size();i++){
            Book_Entity book=allBooks.get(i);
            if(book.getAllocationStatus().equals("Yes")){
                allocatedBooks.add(book);
            }
        }
        return allocatedBooks;
    }


    public String allocatedBooksToStudent(long id,String studentName){
        Book_Entity book=repository.getById(id);
        book.setAllocationStatus("Yes");
        book.setStudentName(studentName);
        repository.save(book);
        return "Allocation Status updated successfullly";

    }

    public String deleteBook(  long id) {
        repository.deleteById(id);
        return "Deleted successfully";
    }


}
