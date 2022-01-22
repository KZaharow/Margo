package com.zahar.margarita.service;

import com.zahar.margarita.entity.Person1;

import java.time.LocalDateTime;
import java.util.List;

public interface DataService {

    List<Person1> readPerson(LocalDateTime birthDay);
    List<Person1> readAllPerson();
    List<Person1> readAllPersonInDateRange(LocalDateTime start,LocalDateTime end);

    Person1 createPerson();
}
