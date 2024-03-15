package com.example.demospringbootproject.service;

import com.example.demospringbootproject.entity.Books;
import com.example.demospringbootproject.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService {
    @Autowired
    BooksRepository repository;
    public String addBooks(Books books){
        repository.save(books);
        return "Book Added Successfully...";
    }
    public List<Books> getAllBooks(){
        return repository.findAll();
    }
    public Books getBookById(long id){
        return  repository.getById(id);
    }
    public String updateBookName(long id,String bookName){
        Books books=repository.getById(id);
        books.setBookName(bookName);
        repository.save(books);
        return "Name Updated Successfully...";
    }
    public List<Books> getAvailableBooks(){
       List<Books> allBooks=repository.findAll();
       List<Books> availableBooks=new ArrayList<>();
        for (int i = 0; i < allBooks.size(); i++) {
            Books books = allBooks.get(i);
            if (books.getAllocationStatus().equals("NO")){
                availableBooks.add(books);
           }
       }
       return availableBooks;
    }
    public List<Books> getAllocatedBooks(){
        List<Books> allBooks=repository.findAll();
        List<Books> allocatedBooks=new ArrayList<>();
        for (int i = 0; i < allBooks.size(); i++) {
            Books books = allBooks.get(i);
            if (books.getAllocationStatus().equals("YES")){
                allocatedBooks.add(books);
            }

        }
        return allocatedBooks;
    }
    public String allocateBook(long id,String studentName){
        Books books=repository.getById(id);
        books.setAllocationStatus("YES");
        books.setStudentName(studentName);
        repository.save(books);
        return "AllocationStatus Updated Successfully...";
    }
    public String removeBook(long id){
        repository.deleteById(id);
        return "Book Deleted Successfully...";
    }
}
