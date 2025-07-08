package com.example.LibraryManagmentSystem.service;

import com.example.LibraryManagmentSystem.entity.Book;
import com.example.LibraryManagmentSystem.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public void addBook(Book book) {
        Book book1=new Book();
        book1.setAuthor(book.getAuthor());
        book1.setTitle(book.getTitle());
        book1.setIsbn(book.getIsbn());
        book1.setCategory(book.getCategory());
        book1.setCopyAvailable(book.getCopyAvailable());
        book1.setTotalCopies(book.getTotalCopies());
        bookRepository.save(book1);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public void updateBook(Long id, Book book) {
        Book book1=bookRepository.findById(id).get();
        book1.setAuthor(book.getAuthor());
        book1.setTitle(book.getTitle());
        book1.setIsbn(book.getIsbn());
        book1.setCategory(book.getCategory());
        book1.setCopyAvailable(book.getCopyAvailable());
        book1.setTotalCopies(book.getTotalCopies());
        bookRepository.save(book1);
    }

    public void DeleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
