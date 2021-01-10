package com.example.hellothymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/hello")
    public String hello(Model model)  {
        return "hello";
    }

    @GetMapping("/fixedgreeting")
    public  String fixedgreeting(Model  model)  {
        String fixedmessage = "FixedMessage";
        model.addAttribute("message",  fixedmessage);
        return "hello";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="message", defaultValue="NAN") String message, Model model) {
        model.addAttribute("message", message);
        return "hello";
    }

}
