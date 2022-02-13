package com.epam.automation.exception;

public class IncorrectRatingException extends RuntimeException {

    public IncorrectRatingException() {
    }

    public IncorrectRatingException(String message) {
        super(message);
    }

    public IncorrectRatingException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectRatingException(Throwable cause) {
        super(cause);
    }

}
