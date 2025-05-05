package com.example.Todo_App.exception;

public class PostAlreadyExistsException extends Throwable {
    public PostAlreadyExistsException(String message) {
        super(message);
    }
}
