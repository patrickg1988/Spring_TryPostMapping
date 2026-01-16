package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class WebController {

    @GetMapping("/")
    public String home () {
        return "index";
    }

    @PostMapping("/sayHello") 
        public String sayHello(@RequestParam String name, Model model) {
            model.addAttribute("name", name);
            return "index";
        }
    
    
}