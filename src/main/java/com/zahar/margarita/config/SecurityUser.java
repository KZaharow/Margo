package com.zahar.margarita.config;

import com.zahar.margarita.entity.Person;
import com.zahar.margarita.status.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;

@Data
@AllArgsConstructor
public class SecurityUser implements UserDetails {

    private final String username;
    private final String password;
    private final Set<SimpleGrantedAuthority> authorities;
    private final boolean isActive;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return isActive;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isActive;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isActive;
    }

    @Override
    public boolean isEnabled() {
        return isActive;
    }

    public static User fromPerson(Person person) {
        return new User(person.getEmail(),
                person.getPassword(),
                person.getStatus().equals(Status.ACTIVE),
                person.getStatus().equals(Status.ACTIVE),
                person.getStatus().equals(Status.ACTIVE),
                person.getStatus().equals(Status.ACTIVE),
                person.getRoles().getGrantedAuthority()
        );
    }
}
