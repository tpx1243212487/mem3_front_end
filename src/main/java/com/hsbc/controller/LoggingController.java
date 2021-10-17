package com.hsbc.controller;

import com.hsbc.annotation.LogAnnotation;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Login")
@RestController
@RequestMapping(path = "/login")
public class LoggingController {

    @LogAnnotation
    @GetMapping(path = "/login/{id}")
    public String login(@PathVariable("id") String id){
        throw new RuntimeException("123123");
    }
}
