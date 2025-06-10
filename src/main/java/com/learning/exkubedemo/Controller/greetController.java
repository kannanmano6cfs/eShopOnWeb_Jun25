package com.learning.exkubedemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetController {
    //My changes
    @GetMapping("/")
    public String greet() {
        return "Hello World!! This is from container in pods of K8s Cluster";
    }
}
