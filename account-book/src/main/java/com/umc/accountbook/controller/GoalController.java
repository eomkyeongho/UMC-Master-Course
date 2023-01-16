package com.umc.accountbook.controller;

import com.umc.accountbook.service.GoalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("goal")
public class GoalController {
    private final GoalService goalService;

    @GetMapping("/rest-amount")
    public Long getRestAmount(@RequestParam int user_id,
                              @RequestParam long goal_id) {
        return goalService.getRestAmount(user_id, goal_id);
    }
}
//일자, 내 사용자 id-> 하루 목표 - 하루 소비 < 0 실패