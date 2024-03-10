package org.hayo.jobsy.models.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ClientResponseDecodingException extends AbstractWebExceptions {

    private final String url;

    public ClientResponseDecodingException(String message, String url) {
        super(message, HttpStatus.NOT_FOUND);
        this.url = url;
    }
}
