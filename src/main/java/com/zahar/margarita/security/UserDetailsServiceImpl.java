package com.zahar.margarita.security;

import com.zahar.margarita.config.SecurityUser;
import com.zahar.margarita.entity.Person;
import com.zahar.margarita.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service(value = "userDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {

    private final PersonRepository personRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Person person = personRepository.findByEmail(username)
                .orElseThrow(() -> new IllegalArgumentException("person not exist"));
        return SecurityUser.fromPerson(person);
    }
}
