package com.hsbc.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Log4j2
public class ExceptionConfiguration {

    @ExceptionHandler(value = {RuntimeException.class})
    public ResponseEntity<String> getError(){
        return new ResponseEntity<>("Hey, Customer, error ocurred during execytion", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
