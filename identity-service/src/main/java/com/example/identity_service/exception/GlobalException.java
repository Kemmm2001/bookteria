package com.example.identity_service.exception;

import com.example.identity_service.dto.respone.ApiRespone;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(value = RuntimeException.class)
    ResponseEntity<ApiRespone> handlingRuntimeException(RuntimeException exception){
        ApiRespone apiRespone = new ApiRespone(false,1001,"faile",ResponseEntity.badRequest().body(exception.getMessage()));
        return ResponseEntity.badRequest().body(apiRespone);
    }
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    ResponseEntity<String> handlingValidation(MethodArgumentNotValidException exception){
        return ResponseEntity.badRequest().body(exception.getFieldError().getDefaultMessage());
    }
}
