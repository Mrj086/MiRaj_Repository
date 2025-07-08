package com.example.LibraryManagmentSystem.repository;

import com.example.LibraryManagmentSystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository <Book,Long>{
}
