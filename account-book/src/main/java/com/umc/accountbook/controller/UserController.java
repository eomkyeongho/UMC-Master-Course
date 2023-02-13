package com.umc.accountbook.controller;

import com.umc.accountbook.domain.User;
import com.umc.accountbook.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    private final UserService userService;
    private final HttpSession httpSession; // 접속했는지 안했는지 확인

    @GetMapping("/login")
    public String login(@RequestParam String email, @RequestParam String name) {
        String userStatus = "";
        String sessionEmail = (String) httpSession.getAttribute("email");

        // 세션에 회원 이메일이 없다면 (로그인중이 아니라면)
        if (sessionEmail == null) {
            User user = userService.findUserByEmail(email);

            // 가입한 회원이 아니라면
            if (user == null) {
                user = new User();
                user.setEmail(email);
                user.setName(name);
                userService.createUser(user);
            }
            httpSession.setAttribute("email", email);
            userStatus = userService.isNoGoal(user.getUserId());
        }
        // 세션에 회원 데이터가 있으면 로그인 (로그인중이라면)
        return userStatus;
    }


    @PostMapping("/logout")
    public String logout(HttpServletRequest request){
        //String email = (String) httpSession.getAttribute("email");
        System.out.println("logout1 = " + httpSession.getAttribute("email").toString());
        httpSession.removeAttribute("email");
        if (httpSession != null) {
            // 현재 사용하고 있는 세션 무효화
            httpSession.invalidate();
        }
        return "redirect:/";
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
