package com.zahar.margarita.permissions;

import lombok.Data;

public enum Permissions {
    DEVELOPERS_READ("developer: read"),
    DEVELOPERS_WRITE("developer: write");

    private final String permission;

    Permissions(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
