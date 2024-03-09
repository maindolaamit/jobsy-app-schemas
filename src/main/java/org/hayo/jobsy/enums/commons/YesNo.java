package org.hayo.jobsy.enums.commons;

public enum YesNo {
    YES("Yes"),
    NO("No");

    private final String value;

    YesNo(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
