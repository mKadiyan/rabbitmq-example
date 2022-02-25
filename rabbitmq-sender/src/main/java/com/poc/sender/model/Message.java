package com.poc.sender.model;

public class Notification {
    private String email;
    private String message;

    public Notification() {
    }

    public Notification(String email, String message) {
        this.email = email;
        this.message = message;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
