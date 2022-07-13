package com.itakademija.mobileshop.controller;

import com.itakademija.mobileshop.model.User;
import com.itakademija.mobileshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/user")
public class UserController {

    @Autowired
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

   /* @GetMapping("/{id}")
    public User getSingleUser(@PathVariable("id") Long id) {
        return this.userRepository.findById(id).get();
    }



    @GetMapping("/")
    public List<User> findAllUsers() {
        return this.userRepository.findAll();*/
    @PostMapping("/saveUser")

    public ResponseEntity<String> saveUser (@RequestBody List<User> users) {

        userRepository.saveAll(users);
        return ResponseEntity.ok("Save data");
    }
    }



