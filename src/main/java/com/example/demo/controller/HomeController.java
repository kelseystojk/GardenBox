package com.example.demo.controller;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {

    @GetMapping("/")
    public String hello(){
        return "index";
    }

    @GetMapping("/message")
    public String message(Model model) {
        model.addAttribute("message", "This is a custom message and will be changed eventually!");
        return "message";
    }

    @GetMapping("/register")
    public String showForm(Model model) {
        GardenBox gardenBox = new GardenBox();
        model.addAttribute("gardenBox", gardenBox);

        List<String> listZone = Arrays.asList("0b", "1a", "1b", "2a", "2b", "3a", "3b", "4a", "4b", "5a", "5b", "6a", "6b", "7a");
        model.addAttribute("listZone", listZone);

        return "register_form";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("gardenBox") GardenBox gardenBox) {
        System.out.println(gardenBox);
        return "register_success";
    }
}
