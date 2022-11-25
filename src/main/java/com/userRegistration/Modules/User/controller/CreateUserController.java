package com.userRegistration.Modules.User.controller;

import com.userRegistration.Modules.User.dao.UserDAO;
import com.userRegistration.Modules.User.model.UserModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateUserController {

    private static final String template = "Hello, %s!";

    @GetMapping("/sla")
    public Boolean list(@RequestParam(value = "name", defaultValue = "World") String name) {
        UserModel user = new UserModel("Paulo Eduardo de Sordi Gomes", "paulo@email.com", "Paulo123");
        Boolean result = UserDAO.createUser(user);
        return result;
    }
}