package com.intern.project.exceptions;

public class DummyNotFoundException extends RuntimeException {
    public DummyNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
