package com.example.SpringSample.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLogin(Model model) {

        return "login/login";
    }

    @PostMapping("/login")
    public String postLogin(Model model) {
        
        // TODO: ログイン機能
        return "login/login";
    }
}