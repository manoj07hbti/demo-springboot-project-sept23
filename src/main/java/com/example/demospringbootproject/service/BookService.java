package com.example.demospringbootproject.service;
import com.example.demospringbootproject.entity.Book;
import com.example.demospringbootproject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
   private BookRepository bookrepository;

    public String addBook(Book book){
       bookrepository.save(book);
       return "Book data added successfully";
    }

    public List<Book> readData (){return bookrepository.findAll();}

    public Book readBook(long id){
        return bookrepository.getById(id);
    }

    public String updateName (String bookName, long id){
        Book book = bookrepository.getById(id);
        book.setBookName(bookName);
        bookrepository.save(book);
        return "Name Updated successfully" +bookName;
    }
    public String deleteName(long id) {
        bookrepository.deleteById(id);
        return "Book data deleted Successfully";
    }
      public List<Book> availableBook(){
     List<Book> books = bookrepository.findAll();
     List <Book> availableBooks=new ArrayList<>();
     for(int i=0; i<books.size(); i++){
         Book book= books.get(i);
         if(book.getAllocationStatus().equals("No")){
             availableBooks.add(book);
         }
     }
    return availableBooks;
    }

    public List<Book> getAllocatedBooks(){
        List<Book> books=bookrepository.findAll();
        List<Book> getAllocatedBooks=new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getAllocationStatus().equals("Yes")){
                getAllocatedBooks.add(book);
            }
        }
        return getAllocatedBooks;
    }
    public String allocateBook(long id,String studentName){
        Book books=bookrepository.getById(id);
        books.setAllocationStatus("Yes");
        books.setStudentName(studentName);
        bookrepository.save(books);
        return "AllocationStatus Updated Successfully...";
    }
    public Book readById(long id){
        return bookrepository.getById(id);
    }


}
