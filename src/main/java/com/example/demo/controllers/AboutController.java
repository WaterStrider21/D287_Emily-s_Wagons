package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//to make rest API add mapping annotation
//Get HTTP Method
//http://localhost:8880/hello-world
//return rest API runs through http client
public class AboutController {
    @GetMapping("/About")
    public String getAbout() {
        return "About";
    }

}