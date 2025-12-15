package org.example.carsharing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController{
    @GetMapping("/")
    public  String index(Model model) {
        model.addAttribute("appName", "Car-Sharing");
        model.addAttribute("healthUrl", "/api/health");
        return "index";
    }
}
