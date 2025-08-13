package com.userapp.exception;

public class InvalidPasswordPatternException extends Exception {
    public InvalidPasswordPatternException() {
    }

    public InvalidPasswordPatternException(String message) {
        super(message);
    }
}
