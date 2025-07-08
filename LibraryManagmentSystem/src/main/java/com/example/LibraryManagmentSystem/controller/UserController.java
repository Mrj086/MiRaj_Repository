package com.example.LibraryManagmentSystem.controller;
import com.example.LibraryManagmentSystem.entity.User;
import com.example.LibraryManagmentSystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class UserController {
   private final UserService userService;

    @PostMapping("/user/add")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping("/user/get")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PutMapping("/user/update/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody User user){
        userService.updateUser(id,user);
    }

    @DeleteMapping("/user/delete/{id}")
    public void DeleteUser(@PathVariable Long id){
        userService.DeleteUser(id);
    }
}

