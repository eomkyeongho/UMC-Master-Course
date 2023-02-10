package com.umc.accountbook.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.time.LocalDate;

@Controller
@RequiredArgsConstructor
@RequestMapping("login")
public class LoginController {
    // HttpServletRequest를 사용하면,  값을 받아올 수 있다.
    // 예를들어, 아이디, 비밀번호 등의 데이터를 컨트롤러로 보냈을때,
    // HttpServletRequest 객체안에 모든 데이터들이 들어가게 된다.

    @GetMapping("/login")
    public void login(@RequestParam(name = "kakaoId") Long kakaoKey,
                        HttpServletRequest request) throws JsonProcessingException {
        HttpSession session = request.getSession();

        // test
    }
}
