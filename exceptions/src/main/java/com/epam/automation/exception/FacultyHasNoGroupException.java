package com.epam.automation.exception;

public class FacultyHasNoGroupException extends RuntimeException {

    public FacultyHasNoGroupException() {
    }

    public FacultyHasNoGroupException(String message) {
        super(message);
    }

    public FacultyHasNoGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public FacultyHasNoGroupException(Throwable cause) {
        super(cause);
    }

}
