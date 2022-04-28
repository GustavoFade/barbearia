package com.example.barbearia.login;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class ControllerLogin {
    @GetMapping
    public String getUser(){

        return "GET";
    }
    @PostMapping
    public String createUser(){

        return "POST";
    }

    //@Requestbody

}
