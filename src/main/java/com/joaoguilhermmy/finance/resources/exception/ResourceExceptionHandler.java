package com.joaoguilhermmy.finance.resources.exception;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.joaoguilhermmy.finance.services.exception.DatabaseExcpition;
import com.joaoguilhermmy.finance.services.exception.ResourceNotFoundExcpetion;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice()
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundExcpetion.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundExcpetion e, HttpServletRequest request) {
        String error = "Resource not found!";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(),
                request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(DatabaseExcpition.class)
    public ResponseEntity<StandardError> dataBase(DatabaseExcpition e, HttpServletRequest request) {
        String error = "Database error!";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(),
                request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
