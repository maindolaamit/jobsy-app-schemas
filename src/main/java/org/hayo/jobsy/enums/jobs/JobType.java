package org.hayo.jobsy.enums.jobs;

public enum JobType {
    FULL_TIME("Full Time"), PART_TIME("Part Time"),
    CONTRACT("Contract"), INTERNSHIP("Internship");

    private final String value;

    JobType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
