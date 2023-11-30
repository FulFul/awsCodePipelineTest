package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class HelloController {


    @GetMapping("/test/{name}")
    public ResponseEntity<String> encryptToken(@PathVariable String name) {
        return ResponseEntity.ok("Siemaaaa " + name + " mordo!");
    }

}
