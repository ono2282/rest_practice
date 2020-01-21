package com.example.practice.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sample")
public class RestApiController {

    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }
}