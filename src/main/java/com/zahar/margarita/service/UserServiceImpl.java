package com.zahar.margarita.service;

import com.zahar.margarita.entity.Person;
import com.zahar.margarita.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Person getUserById(Long id) throws Exception {
        return userRepository.findById(id).orElse(new Person(-1L, "No user"));
    }

    @Override
    public Person saveUser(Person person) throws Exception {
        return userRepository.save(person);
    }

    @Override
    public List<Person> getAllUsers() {
        return userRepository.findAll();
    }
}
