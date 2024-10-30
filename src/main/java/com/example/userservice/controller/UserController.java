package com.example.userservice.controller;

import com.example.userservice.entity.UserEntity;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/sign-up")
    public ResponseEntity<UserEntity>signUp(@RequestBody UserEntity user){
        return new ResponseEntity<>(userService.registerUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserEntity>getUserByid(@PathVariable("id")Long id){
       UserEntity user= userService.getUserById(id);
       return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @GetMapping("/rol-assign")
    public ResponseEntity<String>assignRole(Long id){
      return null;
    }

}
