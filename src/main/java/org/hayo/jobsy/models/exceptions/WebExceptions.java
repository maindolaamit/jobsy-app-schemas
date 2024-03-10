package org.hayo.jobsy.models.exceptions;

import org.springframework.http.HttpStatus;

public interface WebExceptions {
    String getReason();
    HttpStatus getStatus();
}
