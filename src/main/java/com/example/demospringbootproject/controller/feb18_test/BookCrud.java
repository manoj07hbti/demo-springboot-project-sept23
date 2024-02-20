package com.example.demospringbootproject.controller.feb18_test;

import com.example.demospringbootproject.controller.controllersimple.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class BookCrud {

    ArrayList<Book> books=new ArrayList<>();
    @PostMapping("/Add_Books")
    public String LibaryCrud (@RequestBody Book book){
      books.add(book);
    return " Data added successfully ";
    }

    @GetMapping("/Read_Books_Data")
    public ArrayList<Book> getBooks() {
        return books;
    }

    @PutMapping("/Update_Book_Data/{name}/{index}")
    public String UpdateData (@PathVariable String allocationStatus, @PathVariable int index){
       Book book =books.get(index);
       book.setAllocationStatus(allocationStatus);
       return " Name Updated successfully ";
    }

    @DeleteMapping("/Delete_Name_Book/{index}")
    public String DeleteData (@PathVariable int index){
        books.remove(index);
        return " Data deleted successfully ";
    }
}
