package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.entity.Book_Entity;

import com.example.demospringbootproject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService service;

    @PostMapping("/post_book")
    public String addBook(@RequestBody Book_Entity book){
        return service.addBook(book);

    }

    @GetMapping ("/get_book")
    public List<Book_Entity> readBook(){
        return service.readBook();
    }

    @GetMapping("/read_book_id")
    public Book_Entity readBookById(@RequestParam Long id){
        return service.readBookById(id);

    }

    @PutMapping("/update_book")
    public String updateBookName(@RequestParam String bookName, @RequestParam long id) {
        return service.updateBookName(bookName, id);
    }

    @GetMapping("/find_available_books")
    public List<Book_Entity> availableBooks(){
        return service.availableBooks();
    }

    @GetMapping("/find_allocated_books")
    public List<Book_Entity> allocatedBooks(){
        return service.allocatedBooks();
    }


    @PutMapping("/allocated_book")
    public String allocatedBooksToStudent(@RequestParam long id,@RequestParam String studentName){
        return service.allocatedBooksToStudent(id,studentName);
    }

    @DeleteMapping("/delete_book")
    public String deleteBook( @RequestParam long id) {
        return service.deleteBook(id);
    }


}
