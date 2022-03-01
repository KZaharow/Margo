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
    public Person getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(()->new IllegalArgumentException("User not exist"));
    }

    @Override
    public Person saveUser(Person person) {
        return userRepository.save(person);
    }

    @Override
    public List<Person> getAllUsers() {
        return userRepository.findAll();
    }
}
