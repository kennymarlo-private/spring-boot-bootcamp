package com.bootcamp.springboot.controller;

import com.bootcamp.springboot.model.Settings;
import com.bootcamp.springboot.service.SettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "/index"})
public class IndexController {

    private SettingsService settingsService;

    @Autowired
    private IndexController(SettingsService settingsService) {
        this.settingsService = settingsService;
    }

    @GetMapping
    public String main(Model model) {
        model.addAttribute("settings", settingsService.defaultUserProfileSettings());
        return "index";
    }

    @PostMapping
    public String save(Settings settings, Model model) {
        model.addAttribute("settings", settings);
        return "saved";
    }
}
