package com.sb.exception.customExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptions {
	
	@ExceptionHandler(value=ProductNotFoundException.class)
	public ResponseEntity<Object> exception(ProductNotFoundException ex){
		return new ResponseEntity<>("Product not found", HttpStatus.BAD_REQUEST);
	}
	
}
