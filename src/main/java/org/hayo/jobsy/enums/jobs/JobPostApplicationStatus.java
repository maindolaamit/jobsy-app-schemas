package org.hayo.jobsy.enums.jobs;

import lombok.Getter;

@Getter
public enum JobPostApplicationStatus {
    APPLIED("Applied"),
    REJECTED("Rejected"),
    SHORTLISTED("Shortlisted"),
    HIRED("Hired");

    private final String status;

    JobPostApplicationStatus(String status) {
        this.status = status;
    }
}
