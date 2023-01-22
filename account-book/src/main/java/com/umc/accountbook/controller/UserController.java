package com.umc.accountbook.controller;

import com.umc.accountbook.service.KakaoService;
import com.umc.accountbook.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    private final UserService userService;
    private final KakaoService kakaoService;

    @ResponseBody
    @GetMapping("/kakao")
    public void kakaoCallback(@RequestParam String code) throws Exception {
        kakaoService.getKakaoAccessToken(code);
    }
}

// kauth.kakao.com/oauth/authorize?client_id=384deba2f1d57379b3de4dfccb3ee740&redirect_uri=http://localhost:8081/user/kakao&response_type=code