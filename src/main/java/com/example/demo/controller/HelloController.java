package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jolie
 * @create 2020-07-07 21:56
 */
@RestController
public class HelloController {
    @GetMapping("/info")
    public String info() {
        return "Hello SpringBoot Info";
    }
}
