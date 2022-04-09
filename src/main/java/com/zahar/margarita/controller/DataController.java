package com.zahar.margarita.controller;

import com.zahar.margarita.entity.Person;
import com.zahar.margarita.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DataController {

    private final PersonService personService;

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('developer: read')")
    public Person getUserById(@PathVariable("id") Long id) throws Exception {
        return personService.getPersonById(id);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('developer: read')")
    public List<Person> getAllUsers() {
        return personService.getAllPersons();
    }

    @PostMapping(consumes = "application/json")
    @PreAuthorize("hasAnyAuthority('developer: write')")
    public Person saveUser(@RequestBody() Person person) throws Exception {
        return personService.savePerson(person);
    }
}
