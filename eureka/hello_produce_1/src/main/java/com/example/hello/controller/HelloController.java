package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(@RequestParam("param") String param){
            return param;
    }
}
