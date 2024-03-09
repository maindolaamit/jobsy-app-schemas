package org.hayo.jobsy.enums.user;

import lombok.Getter;

@Getter
public enum UserStatus {
    ACTIVE("Active"),
    INACTIVE("Inactive"),
    SUSPENDED("Suspended")
    ;

    private final String value;

    UserStatus(String value) {
        this.value = value;
    }
}
