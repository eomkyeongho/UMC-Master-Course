package com.umc.accountbook.controller;

import com.umc.accountbook.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    private final UserService userService;
}
