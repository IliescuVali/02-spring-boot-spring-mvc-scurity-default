package com.devvali.springboot.demoSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class demoController {

    @GetMapping("/")
    public String showHome() {
        return "home";

    }

    //add a request mapping for/leaders
    @GetMapping("/leaders")
    public String showleaders() {
        return "leaders";
    }

    //add a request mapping for /systems
    @GetMapping("/systems")
    public String showsystems() {
        return "systems";
    }
}
