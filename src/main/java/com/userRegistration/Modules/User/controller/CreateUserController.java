package com.userRegistration.Modules.User.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateUserController {

    private static final String template = "Hello, %s!";

    @GetMapping("/sla")
    public String list(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format(template, name);
    }
}