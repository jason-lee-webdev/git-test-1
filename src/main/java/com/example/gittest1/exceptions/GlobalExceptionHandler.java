package com.example.gittest1.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.gittest1.domain.vo.StatusDTO;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = {CustomException.class})
    protected ResponseEntity<StatusDTO> handlerCustomException(CustomException ex){
        HttpStatus.valueOf(ex.getStatusCode().getStatus());
        return new ResponseEntity<>(new StatusDTO(ex.getStatusCode().getStatus(), ex.getStatusCode().getMessage()), HttpStatus.valueOf(ex.getStatusCode().getStatus()));
    }
}
