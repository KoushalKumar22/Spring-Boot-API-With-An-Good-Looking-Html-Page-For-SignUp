package com.SpringBootAPI.SignUp_Page.Controller;

import com.SpringBootAPI.SignUp_Page.Repository.SignUpRepository;
import com.SpringBootAPI.SignUp_Page.Services.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    private SignUpRepository srepo;

    @GetMapping("/")
    public String test() {
        return "SignUp";
    }

    @PostMapping("/register")
    public String signup(@ModelAttribute SignUp signUp, Model model) {
        System.out.println(signUp.toString());
        SignUp savedSignUp = srepo.save(signUp);
        model.addAttribute("Message",savedSignUp.getName() + " Welcome");
        return "Welcome";
    }
}

