package org.hayo.jobsy.enums.jobs;

public enum JobPostStatus {
    ACTIVE("Active"),
    INACTIVE("Inactive");
    private final String value;

    JobPostStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
