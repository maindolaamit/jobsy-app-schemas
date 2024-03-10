package org.hayo.jobsy.models.exceptions;

import org.springframework.http.HttpStatus;

public class VerificationCodeInvalidException extends AbstractWebExceptions {
    public VerificationCodeInvalidException() {
        super("Invalid verification code", HttpStatus.BAD_REQUEST);
    }
}
