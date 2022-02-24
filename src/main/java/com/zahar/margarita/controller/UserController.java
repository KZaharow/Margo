package com.zahar.margarita.controller;

import com.zahar.margarita.entity.Person;
import com.zahar.margarita.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/forms")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String getLoginPage(){
        return "login_page";
    }

    @GetMapping("/success")
    public String getSuccess(){
        return "success";
    }

    @GetMapping("/add")
    public String getUserPage(){
        return "add_user";
    }

    @PostMapping("/add")
    public String addUser(@RequestParam String name) throws Exception {
        userService.saveUser(new Person(null, name));
        return "add_user";
    }

}
