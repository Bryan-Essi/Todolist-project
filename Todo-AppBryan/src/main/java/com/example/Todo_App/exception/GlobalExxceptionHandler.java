package com.example.Todo_App.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExxceptionHandler {
    @ExceptionHandler(PostAlreadyExistsException.class)

    public ResponseEntity<String>   handlePostAlreadyExists(PostAlreadyExistsException ex){
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
