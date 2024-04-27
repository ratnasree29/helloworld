package com.example.helloworld.controllers;

import com.example.helloworld.models.Request;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

    @GetMapping("/helloworld")
    public String getHelloworld() {
        return "helloworld!!";
    }

    @PostMapping("/helloworldrequest")
    public String getHelloworld(@RequestBody Request request) {
        return request.getFirstName() + " " + request.getLastName();
    }
}
