package com.zahar.margarita.service;

import com.zahar.margarita.entity.Person;

import java.util.List;

public interface PersonService {

    Person getPersonById(Long id) throws Exception;

    Person savePerson(Person person) throws Exception;

    List<Person> getAllPersons();
}
