package com.logamani.speakingclock.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TimeFormatException extends RuntimeException {

    public TimeFormatException(String message) {
        super(message);
    }
}