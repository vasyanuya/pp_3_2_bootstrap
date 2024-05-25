package ru.kata.spring.boot_security.demo.controllers;


import org.springframework.security.core.annotation.AuthenticationPrincipal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kata.spring.boot_security.demo.entities.User;

import java.util.Collection;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping()
    public String adminInfo(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("currentUser", user);
        return "user";
    }
}
