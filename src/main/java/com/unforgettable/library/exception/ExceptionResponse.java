package com.unforgettable.library.exception;

import org.springframework.http.HttpStatus;

import java.sql.Timestamp;
import java.time.ZonedDateTime;

public class ExceptionResponse {
    private final String message;
    private final HttpStatus httpStatus;
    private final Timestamp timestamp;

    public ExceptionResponse(String message, HttpStatus httpStatus, Timestamp timestamp) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
