package com.zahar.margarita.service;

import com.zahar.margarita.entity.User;
import com.zahar.margarita.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUserById(Long id) throws Exception {
        return userRepository.findById(id).orElse(new User(-1L, "No user"));
    }

    @Override
    public User saveUser(User user) throws Exception {
        return userRepository.save(user);
    }
}
