package com.example.demo.controller;

import java.util.*;

import com.example.demo.Plant;
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

    @PostMapping("/register")
    public String showForm(Model model) {
        GardenBox gardenBox = new GardenBox();
        model.addAttribute("gardenBox", gardenBox);

        List<String> listZone = Arrays.asList("0b", "1a", "1b", "2a", "2b", "3a", "3b", "4a", "4b", "5a", "5b", "6a", "6b", "7a");
        /*List<Plant> listPlant = Arrays.asList(
                new Plant("Tomato", "acidic", 0, "full", 15, 30, 450, "NA", true, false, false, false, false),
                new Plant("Potato", "neutral-acidic", 1, "full", 60, 30, 1800, "4a", false, false, true, true, false),
                new Plant("Giant Sunflower", "neutral", 1, "full", 60, 60, 3600, "2a", false, false, true, false, false),
                new Plant("Kabocha", "neutral-acidic", 6, "full", 12, 60, 720, "3a", false, true, false, false, false)
        );*/
        model.addAttribute("listZone", listZone);
        //model.addAttribute("listPlant", listPlant);

        return "register_form";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("gardenBox") GardenBox gardenBox) {
        System.out.println(gardenBox);
        return "register_success";
    }

}
