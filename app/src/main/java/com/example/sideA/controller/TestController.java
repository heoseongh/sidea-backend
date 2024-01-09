package com.example.sideA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String Hello () {

        return "<h1>hello</h1>";
    }
}
