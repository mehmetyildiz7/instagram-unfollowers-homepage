package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("appName", "Instagram Unfollowers Tracker");
        model.addAttribute("description", "Find out who doesn't follow you back on Instagram. Our mobile app helps you track unfollowers, manage your followers, and grow your Instagram presence.");
        model.addAttribute("features", new String[]{
            "See who doesn't follow you back",
            "Track lost followers",
            "Manage your followers list",
            "Easy and secure login"
        });
        model.addAttribute("androidLink", "#"); // Replace with actual link
        model.addAttribute("iosLink", "#"); // Replace with actual link
        return "home";
    }
}
