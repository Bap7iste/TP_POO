package com.TP3.TP3.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ResultController {
    @GetMapping("/meteo")
    public String meteo() {
        return "meteo";
    }
}
