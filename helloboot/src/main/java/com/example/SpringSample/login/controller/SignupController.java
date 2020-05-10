package com.example.SpringSample.login.controller;

import com.example.SpringSample.login.domain.model.SignupForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {

    private static final Logger logger = LoggerFactory.getLogger(SignupController.class);


    @GetMapping("/signup")
    public String getSignUp(@ModelAttribute SignupForm form, Model model){

        // TODO: Model実装
        logger.info(form.toString());

        return "login/signup";
    }

    @PostMapping("/signup")
    public String postSignUp(@ModelAttribute SignupForm form, Model model) {

        logger.info(form.toString());

        return "redirect:/login";
    }
}
