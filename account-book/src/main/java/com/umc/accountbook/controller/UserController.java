package com.umc.accountbook.controller;

import com.umc.accountbook.domain.User;
import com.umc.accountbook.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    private final UserService userService;
    private final HttpSession httpSession;

    @GetMapping("/login")
    public String login(@RequestParam String email, @RequestParam String name) {
        String userStatus = "";
        String sessionEmail = (String) httpSession.getAttribute("email");

        if(sessionEmail == null) {
            User user = userService.findUserByEmail(email);

            if (user == null) {
                user = new User();
                user.setEmail(email);
                user.setName(name);
                userService.createUser(user);
            }
            httpSession.setAttribute("email", email);
            userStatus = userService.isNoGoal(user.getUserId());
        }
        return userStatus;
    }

    @GetMapping("/test")
    public User test(){
        String sessionEmail = (String) httpSession.getAttribute("email");

        if(sessionEmail != null) {
            User user = userService.findUserByEmail(sessionEmail);
            return user;
        }

        return null;
    }
}
