package com.example.LibraryManagmentSystem.controller;

import com.example.LibraryManagmentSystem.entity.Book;
import com.example.LibraryManagmentSystem.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping("/book/add")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @GetMapping("/book/get")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PutMapping("/book/update/{id}")
    public void updateBook(@PathVariable Long id, @RequestBody Book book){
        bookService.updateBook(id,book);
    }

    @DeleteMapping("/book/delete/{id}")
    public void DeleteBook(@PathVariable Long id){
     bookService.DeleteBook(id);
    }
}
