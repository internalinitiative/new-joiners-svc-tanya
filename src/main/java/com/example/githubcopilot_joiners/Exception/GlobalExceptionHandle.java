package com.example.githubcopilot_joiners.Exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.context.request.WebRequest;

public interface GlobalExceptionHandle {
    ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex);

}
