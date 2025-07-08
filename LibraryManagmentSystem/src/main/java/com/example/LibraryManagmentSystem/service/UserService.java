package com.example.LibraryManagmentSystem.service;

import com.example.LibraryManagmentSystem.entity.User;
import com.example.LibraryManagmentSystem.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


        public void addUser(User user) {
            User user1 =new User();
            user1.setName(user.getName());
            user1.setEmail(user.getEmail());
            user1.setPassword(user.getPassword());
            user1.setJoinDate(user.getJoinDate());
            user1.setActiveStatus(user.getActiveStatus());
            user1.setEmail(user.getEmail());
            userRepository.save(user);

            }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public void updateUser(Long id, User user) {
        User user1=userRepository.findById(id).get();
        user1.setName(user.getName());
        user1.setEmail(user.getEmail());
        user1.setPassword(user.getPassword());

    }

    public void DeleteUser(Long id) {
        userRepository.deleteById(id);
    }


    }



