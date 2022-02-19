package com.zahar.margarita.controller;

import com.zahar.margarita.entity.Person;
import com.zahar.margarita.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DataController {

    private final UserService userService;

    @GetMapping("/{id}")
    public Person getUserById(@PathVariable("id") Long id) throws Exception {
        return userService.getUserById(id);
    }

    @GetMapping
    public List<Person> getAllUsers() throws Exception {
        return userService.getAllUsers();
    }

    @PostMapping
    public Person saveUser(@RequestBody() Person person) throws Exception {
        return userService.saveUser(person);
    }
}
