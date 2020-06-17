package com.example.practialtest.controller;

import com.example.practialtest.entity.User;
import com.example.practialtest.responsitory.UserResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserResponsitory userResponsitory;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        List<User> users = userResponsitory.findUserByUsernameAndPassword(username, password);
        if(users.isEmpty()) {
            return "redirect:/?msg=Please check your user name and passwod";
        }
        return "redirect:/list-product";
    }
}
