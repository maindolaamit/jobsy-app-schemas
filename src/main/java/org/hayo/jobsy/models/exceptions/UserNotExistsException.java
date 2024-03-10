package org.hayo.jobsy.models.exceptions;

import org.springframework.http.HttpStatus;

public class UserNotExistsException extends AbstractWebExceptions {

    public UserNotExistsException(String user) {
        super("User does not exists: " + user, HttpStatus.NOT_FOUND);
    }
}
