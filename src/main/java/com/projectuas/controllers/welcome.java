package com.projectuas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class welcome {
    
    @GetMapping
    public String Welcome(){
        return "Welcome to our class SK1C! Don't forget to follow our insta: @homiessc_ ^^";
    }
}
