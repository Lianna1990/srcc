package ru.geekbrains.lesson7.auth;

public class AuthException extends RuntimeException {

    public AuthException(String message, Throwable cause) {
        super(message, cause);
    }
}
