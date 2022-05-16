package com.galaxy.universe.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

    @Value("${galaxy.universe.name:}")
    private String galaxyUniverseName;

    @GetMapping("/name")
    public String frontControllerTest() {
        return "galaxyUniverseName :: " + galaxyUniverseName;
    }
}
