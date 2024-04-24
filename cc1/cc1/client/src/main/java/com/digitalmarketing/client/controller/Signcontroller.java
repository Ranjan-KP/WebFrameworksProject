package com.digitalmarketing.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitalmarketing.client.model.Signup;
import com.digitalmarketing.client.services.*;

@RestController
@RequestMapping("/sign")
public class Signcontroller {

    @Autowired
    private SignService signupService;

    @PostMapping("/signup")
    public String signUp(@RequestBody Signup signup) {
        Signup sign = signupService.getUser(signup.getEmailId());
        if (sign == null) {
            signupService.signup(signup);
            return "Signed up successfully";
        }
        return "EmailId already exists!!";
    }

    @GetMapping("/login")
    public String login(@RequestParam String emailId, @RequestParam String password) {
        Signup log = signupService.loginCheck(emailId, password);
        if (log == null) {
            return "Invalid Email Id or password";
        }
        return "Login Successful";
    }
}