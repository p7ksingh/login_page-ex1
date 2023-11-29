package com.pankaj.www.thymeleafresponceex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/loginprocess")
    public String loginProcess(@ModelAttribute LoginDetails loginDetails) {

        String username = loginDetails.getUsername();
        String password = loginDetails.getPassword();

        if (username.equalsIgnoreCase("pankaj") && password.equals("pankaj@123")) {
            return "login-success";
        } else {

            return "login-failed";
        }

    }
}
