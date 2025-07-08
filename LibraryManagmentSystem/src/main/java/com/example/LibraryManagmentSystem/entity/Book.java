package com.example.LibraryManagmentSystem.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String isbn;
    private String author;
    private String category;
    private int copyAvailable;
    private int totalCopies;


    @ManyToMany
            @JoinTable(
                    name="user_book",
                    joinColumns = @JoinColumn(name="book_id"),
                    inverseJoinColumns = @JoinColumn(name="user_id")
            )
            @JsonBackReference
    List<User>userList;

}
