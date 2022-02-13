package com.epam.automation.exception;

public class StudentHasNoDisciplineException extends RuntimeException {

    public StudentHasNoDisciplineException() {
    }

    public StudentHasNoDisciplineException(String message) {
        super(message);
    }

    public StudentHasNoDisciplineException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentHasNoDisciplineException(Throwable cause) {
        super(cause);
    }

}
