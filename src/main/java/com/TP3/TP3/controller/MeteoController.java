package com.TP3.TP3.controller;

import com.TP3.TP3.model.Root;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MeteoController {
    @PostMapping("/meteo")
    public String getcoord(@RequestParam(name="address", required=false, defaultValue = "")String address, Model model)
    {
        RestTemplate template = new RestTemplate();
        model.addAttribute("nomcity", address);
        String Url = "https://api-adresse.data.gouv.fr/search/?q="+address+"&limit=1";
        Root response = template.getForObject(Url, Root.class);

        System.out.println(response);
        model.addAttribute("coor", response);
        return "meteo";
    }
}