package org.hayo.jobsy.enums.user;

import lombok.Getter;

@Getter
public enum UserType {
    COMPANY("Company"),
    USER("User");

    private final String value;

    UserType(String value) {
        this.value = value;
    }
}
