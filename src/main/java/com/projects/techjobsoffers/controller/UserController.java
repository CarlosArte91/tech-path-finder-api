package com.projects.techjobsoffers.controller;

import com.projects.techjobsoffers.model.entity.User;
import com.projects.techjobsoffers.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private IUser userService;

    @GetMapping("users")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<User> index() {
        return userService.findAll();
    }

    @GetMapping("user/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User show(@PathVariable Integer id) {
        return userService.findById(id);
    }

    @PostMapping("user")
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping("user")
    @ResponseStatus(HttpStatus.CREATED)
    public User update(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("user/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        User userToDelete = userService.findById(id);
        userService.delete(userToDelete);
    }

    @PostMapping("login")
    public ResponseEntity<User> login(@RequestParam String email, @RequestParam String password) {
        User user = userService.byEmailAndPassword(email, password);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(401).build();
        }
    }

}
