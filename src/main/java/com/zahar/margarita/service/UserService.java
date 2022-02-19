package com.zahar.margarita.service;

import com.zahar.margarita.entity.User;

public interface UserService {

    User getUserById(Long id) throws Exception;
    User saveUser(User user) throws Exception;
}
