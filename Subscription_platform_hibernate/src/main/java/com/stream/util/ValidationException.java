package com.stream.util;

public class ValidationException extends RuntimeException {

    public ValidationException() {
        super("Validation failed: Empty userID, user does not exist, invalid dates, negative amounts, or invalid payment details.");
    }

    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
