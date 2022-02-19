package com.zahar.margarita.service;

import com.zahar.margarita.entity.Person;

import java.util.List;

public interface UserService {

    Person getUserById(Long id) throws Exception;
    Person saveUser(Person person) throws Exception;
    List<Person> getAllUsers();
}
