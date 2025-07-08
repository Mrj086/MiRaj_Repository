package com.example.LibraryManagmentSystem.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private LocalDate joinDate;
    private Boolean activeStatus;

    @OneToMany(mappedBy="user")
            @JsonManagedReference
    List<Loan>loanList;

    @ManyToMany(mappedBy="userList")
    @JsonManagedReference
    List<Book>bookList;

}
