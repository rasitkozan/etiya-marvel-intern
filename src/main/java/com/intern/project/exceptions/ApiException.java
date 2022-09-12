package com.intern.project.exceptions;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public record ApiException(String message, HttpStatus codeStatus, ZonedDateTime timestamp) { }
