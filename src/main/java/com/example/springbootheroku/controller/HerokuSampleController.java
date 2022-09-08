package com.example.springbootheroku.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HerokuSampleController {

    @GetMapping
    public String getHelloWorld() {

        return "Hello World!";
    }

}
