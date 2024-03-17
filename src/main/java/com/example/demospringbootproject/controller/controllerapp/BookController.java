package com.example.demospringbootproject.controller.controllerapp;

import com.example.demospringbootproject.entity.Book;
import com.example.demospringbootproject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class BookController {

    @Autowired
   private BookService bookService;
    @PostMapping("/Add_Book")
    public String addBook (@RequestBody Book book){
    return bookService.addBook(book);
    }
    @GetMapping("/Read_Book")
    public List<Book> readBook (){
        return bookService.readData();
    }
    @GetMapping("/Read_Id")
    public Book getById(@RequestParam long id){
        return bookService.readBook(id);
    }
    @PutMapping("/Update_Book_Data")
    public String updateData(@RequestParam String bookName, @RequestParam long id){
        return bookService.updateName(bookName, id);
    }
    @DeleteMapping("/Delete_Book_Data")
    public String deleteData(@RequestParam long id){
        return bookService.deleteName(id);
    }

    @GetMapping("/find_available_book")
    public List<Book> availableBook(){
        return bookService.availableBook();
    }
    @GetMapping("/find_allocated_book")
    public List<Book> getAllocatedBooks(){
        return bookService.getAllocatedBooks();
    }
    @PutMapping("/allocate_book/{id}/{studentName}")
    public String allocateBook(@PathVariable long id, @PathVariable String studentName){
    return bookService.allocateBook(id,studentName);
    }
    @GetMapping("/Read_by_Id/{id}")
    public Book readById(@PathVariable long id){
        return bookService.readBook(id);
    }

}


