package com.example.demospringbootproject.controller.test_18Feb_23;

import com.example.demospringbootproject.model.Books;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;

@RestController
public class Ques7 {
    /*Write a CRUD for Book in a Library ,Book will have Name, Subject and writer,
    allocationStatus : YES or NO ,  we need to create one more end point to allocate a book ,
    once it is allocated it should show  allocationStatus  as YES ,
    we need to create two more end points /availableBooks --> it will show all available books which
    is not allocated means they will have allocationStatus  as NO ,
    and /allocated_books   will show all the books which is allocated to someone means
    they will have allocationStatus as YES
     */
    ArrayList<Books> books = new ArrayList<>();

    @PostMapping("/create_books")
    public String createBook(@RequestBody Books book) {
        books.add(book);
        return "Book added successfully";
    }


    @GetMapping("/get_books")
    public ArrayList<Books> getBooks() {
        return books;
    }

    // Update allocation status of a book
    @PutMapping("/allocate")
    public String allocateBook(@RequestParam String name, @RequestParam String allocationStatus) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(name)) {
                books.get(i).setAllocationStatus(allocationStatus);
                return "Book allocation status updated successfully";
            }
        }
        return "Book not found";
    }

    // Getting all available books (allocationStatus = NO)
    @GetMapping("/availableBooks")
    public ArrayList<Books> getAvailableBooks() {
        ArrayList<Books> availableBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Books book = books.get(i);
            if (book.getAllocationStatus().equals("NO")) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    //Getting all allocated books (allocationStatus = YES)
    @GetMapping("/allocatedBooks")
    public ArrayList<Books> getAllocatedBooks() {
        ArrayList<Books> allocatedBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAllocationStatus().equals("YES")) {
                allocatedBooks.add(books.get(i));
            }
        }
        return allocatedBooks;
    }

    // Update book details
    @PutMapping("/update_book")
    public String updateBook(@RequestParam String name, @RequestBody Books updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            Books book = books.get(i);
            if (book.getName().equals(name)) {
                book.setSubject(updatedBook.getSubject());
                book.setWriter(updatedBook.getWriter());
                book.setAllocationStatus(updatedBook.getAllocationStatus());

                return "Book details updated successfully";
            }
        }
        return "Book not found";
    }

    // Remove a book
    @DeleteMapping("/remove_book")
    public String removeBook(@RequestParam String name) {
        for (int i = 0; i < books.size(); i++) {
            Books book = books.get(i);
            if (book.getName().equals(name)) {
                books.remove(i);
                return "Book removed successfully";
            }
        }
        return "Book not found";
    }
}
