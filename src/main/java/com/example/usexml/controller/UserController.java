package com.example.usexml.controller;

import com.example.usexml.entity.User;
import com.example.usexml.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("")
    public ResponseEntity<List<User>> findAll(){
        return new ResponseEntity<>(userMapper.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable("id") Long id){
        return new ResponseEntity<>(userMapper.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> insertUser(@RequestBody User user){
        userMapper.insertUser(user);
        return new ResponseEntity<>("Insert user successfully!", HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<String> updateUser(@RequestBody User user){
        userMapper.updateById(user);
        return new ResponseEntity<>("Update user successfully!",HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id){
        userMapper.deleteById(id);
        return new ResponseEntity<>("Delete user successfully!", HttpStatus.OK);
    }
}
