package br.edu.ifes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
    @RequestMapping("/login")
    public String index() {
        return "Login Carai!!";
    }
}