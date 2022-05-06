package com.zahar.margarita.service;

import com.zahar.margarita.entity.Person;
import com.zahar.margarita.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    @Transactional
    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not exist"));
    }

    @Override
    @Transactional
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    @Transactional
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
