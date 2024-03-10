package org.hayo.jobsy.models.exceptions;

import org.springframework.http.HttpStatus;

public class EmailNotRegisteredException extends AbstractWebExceptions {

    public EmailNotRegisteredException(String email) {
        super("User email not registered: " + email, HttpStatus.NOT_FOUND);
    }
}
