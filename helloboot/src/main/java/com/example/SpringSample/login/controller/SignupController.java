package com.example.SpringSample.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {

    @GetMapping("/signup")
    public String getSignUp(Model model){

        // TODO: Model実装

        return "login/signup";
    }

    @PostMapping("/signup")
    public String postSignUp(Model model) {

        return "redirect:/login";
    }
}
