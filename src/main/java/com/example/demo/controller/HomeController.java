package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

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

        //List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
        //model.addAttribute("listProfession", listProfession);

        return "register_form";
    }
}
