package com.TP3.TP3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddressMeteoController {
    @GetMapping("/addresse")
    public String addresse() {
        return "addresse";
    }
}

