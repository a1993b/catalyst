package com.catalyst.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalystController {

    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Hello world";
    }
}