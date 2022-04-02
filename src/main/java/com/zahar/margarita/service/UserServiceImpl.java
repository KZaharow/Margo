package com.zahar.margarita.service;

import com.zahar.margarita.entity.Person;
import com.zahar.margarita.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final PersonRepository personRepository;

    @Override
    public Person getUserById(Long id) {
        return personRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not exist"));
    }

    @Override
    public Person saveUser(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> getAllUsers() {
        return personRepository.findAll();
    }
}
