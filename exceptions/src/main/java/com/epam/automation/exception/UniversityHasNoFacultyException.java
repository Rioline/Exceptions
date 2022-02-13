package com.epam.automation.exception;

public class UniversityHasNoFacultyException extends Exception {

    public UniversityHasNoFacultyException() {
    }

    public UniversityHasNoFacultyException(String message) {
        super(message);
    }

    public UniversityHasNoFacultyException(String message, Throwable cause) {
        super(message, cause);
    }

    public UniversityHasNoFacultyException(Throwable cause) {
        super(cause);
    }

}
