package com.example.SpringSample.trySpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String getHello() {
        return "hello";
    }

    @PostMapping("/hello")
    public String postRequest(@RequestParam("text1") String text1, Model model) {

        model.addAttribute("sample", text1);

        return "helloResponse";
    }

    @PostMapping("/hello/db")
    public String postDbRequest(@RequestParam("text2") String text2, Model model) {
        // Form -> Input
        int id = Integer.parseInt(text2);
        // Service実行
        Employee employee = helloService.findOne(id);

        model.addAttribute("employee_id", employee.getEmployeeId());
        model.addAttribute("employee_name", employee.getEmployeeName());
        model.addAttribute("employee_age", employee.getAge());

        return "helloResponseDB";
    }
}
