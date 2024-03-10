package org.hayo.jobsy.models.exceptions;

import org.springframework.http.HttpStatus;

public class VerificationCodeExpiredException extends AbstractWebExceptions {
    public VerificationCodeExpiredException() {

        super("Verification code has expired, please request a new one.",
                HttpStatus.BAD_REQUEST);
    }
}
