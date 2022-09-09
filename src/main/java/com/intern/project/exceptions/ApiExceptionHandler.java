package com.intern.project.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

//Basitçe tüm controllerları kontorl etmeye yarar.
@RestControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ApiException> handleNotFoundException(NotFoundException exception) {
        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        ApiException apiException = createApiException(exception, httpStatus);
        return new ResponseEntity<>(apiException, httpStatus);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ApiException> handleBadRequestException(BadRequestException exception) {
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        ApiException apiException = createApiException(exception, httpStatus);
        return new ResponseEntity<>(apiException, httpStatus);
    }

    @ExceptionHandler(InterruptedException.class)
    public ResponseEntity<ApiException> handleBadRequestException(InterruptedException exception) {
        HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        ApiException apiException = createApiException(exception, httpStatus);
        return new ResponseEntity<>(apiException, httpStatus);
    }

    private ApiException createApiException(Exception exception, HttpStatus badRequest){
        return new ApiException(
                exception.getMessage(),
                badRequest,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
    }
}
