package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class UserController {

    @Autowired
    private UserService service;
    @GetMapping("/user")
    public List<User> list() {
        return service.listAll();
    }
    @GetMapping("/user/{userID}")
    public ResponseEntity<User> get(@PathVariable Integer userID) {
        try {
            User user = service.get(userID);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/user")
    public void add(@RequestBody User user) {
        service.save(user);
    }






}