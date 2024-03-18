package com.example.demospringbootproject.controller;

import com.example.demospringbootproject.entity.Books;
import com.example.demospringbootproject.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksDbController {
    @Autowired
    BooksService service;

    @PostMapping("/add_books")
    public String addBooks(@RequestBody Books books) {
        return service.addBooks(books);

    }

    @GetMapping("/books")
    public List<Books> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/get_book_id/{id}")
    public Books getBookById(@PathVariable long id) {
        return service.getBookById(id);
    }

    @PutMapping("/update_book_name/{id}/{bookName}")
    public String updateBookName(@PathVariable long id, @PathVariable String bookName) {
        return service.updateBookName(id, bookName);
    }

    @PutMapping("/allocate_book/{id}/{studentName}")
    public String allocateBook(@PathVariable long id, @PathVariable String studentName) {
        return service.allocateBook(id, studentName);
    }

    @GetMapping("/find_available_book")
    public List<Books> getAvailableBooks() {
        return service.getAvailableBooks();
    }

    @GetMapping("/find_allocated_book")
    public List<Books> getAllocatedBooks() {
        return service.getAllocatedBooks();
    }

    @DeleteMapping("/remove_book/{id}")
    public String removeBook(@PathVariable long id) {
        return service.removeBook(id);
    }


}
