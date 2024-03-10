package org.hayo.jobsy.models.exceptions;

import org.springframework.http.HttpStatus;

public class EmailAlreadyExistsException extends AbstractWebExceptions {
    public EmailAlreadyExistsException(String email) {

        super("User email already registered : " + email, HttpStatus.NOT_FOUND);
    }
}
