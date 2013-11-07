package com.github.liosha2007.groupdocs.common;

public class ApiException extends Exception {
    protected String message = null;

    public ApiException() {
    }

    public ApiException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
