package com.zahar.margarita.controller;

import com.zahar.margarita.entity.User;
import com.zahar.margarita.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DataController {

    private final UserService userService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id) throws Exception {
        return userService.getUserById(id);
    }

    @PostMapping
    public User saveUser(@RequestBody() User user) throws Exception {
        return userService.saveUser(user);
    }
}
