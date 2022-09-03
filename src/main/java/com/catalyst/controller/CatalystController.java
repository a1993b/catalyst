package com.catalyst.controller;

import com.catalyst.service.CatalystService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalystController {

    @Autowired
    private CatalystService catalystService;

    @GetMapping("/hello-world")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok().body(catalystService.helloWorld());
    }
}
