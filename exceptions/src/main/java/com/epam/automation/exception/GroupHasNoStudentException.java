package com.epam.automation.exception;

public class GroupHasNoStudentException extends RuntimeException {

    public GroupHasNoStudentException() {
    }

    public GroupHasNoStudentException(String message) {
        super(message);
    }

    public GroupHasNoStudentException(String message, Throwable cause) {
        super(message, cause);
    }

    public GroupHasNoStudentException(Throwable cause) {
        super(cause);
    }

}
