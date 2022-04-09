package com.zahar.margarita.controller;

import com.zahar.margarita.entity.Person;
import com.zahar.margarita.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/forms")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/")
    public String getAllPersons(Model model) {
        List<Person> persons = personService.getAllPersons();
        model.addAttribute("persons", persons);
        return "persons";
    }

    @GetMapping("/login")
    public String getLoginPage() {
        return "login_page";
    }

    @GetMapping("/success")
    public String getSuccess() {
        return "success";
    }

    @GetMapping("/add")
    public String getUserPage() {
        return "add_user";
    }

    @PostMapping("/add")
    public String addUser(@RequestParam String name) throws Exception {
        //userService.saveUser(new Person(null, name));
        return "add_user";
    }
}
