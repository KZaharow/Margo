package com.zahar.margarita.roles;

import com.zahar.margarita.permissions.Permissions;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Roles {
    USER(Stream.of(Permissions.DEVELOPERS_READ).collect(Collectors.toSet())),
    ADMIN(Stream.of(Permissions.DEVELOPERS_READ,
            Permissions.DEVELOPERS_WRITE)
            .collect(Collectors.toSet()));

    private final Set<Permissions> permissions;

    Roles(Set<Permissions> permissions) {
        this.permissions = permissions;
    }

    public Set<Permissions> getPermissions() {
        return permissions;
    }

    public Set<GrantedAuthority> getGrantedAuthorityI(){
        return getPermissions()
                .stream()
                .map(p->new SimpleGrantedAuthority(p.getPermission()))
                .collect(Collectors.toSet());
    }
}
