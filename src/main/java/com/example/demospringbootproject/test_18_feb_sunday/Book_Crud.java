package com.example.demospringbootproject.test_18_feb_sunday;

import com.example.demospringbootproject.model.Books;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Book_Crud {

ArrayList<Books> bookCrud=new ArrayList<>();

@PostMapping("/add_book")
public String addbook(@RequestBody Books book){
    bookCrud.add(book);
    return" book added successfully";
}

@GetMapping("/read_book")
public ArrayList<Books> readBoook(){
    return bookCrud;
}


}
