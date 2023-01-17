package com.umc.accountbook.controller;

import com.umc.accountbook.domain.EssentialSpending;
import com.umc.accountbook.service.GoalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("goal")
public class GoalController {
    private final GoalService goalService;

    @GetMapping("/daily-avail-amount")
    public Long getRestAmount(@RequestParam int goal_id, @RequestParam long user_id) {
        return goalService.getDailyAvailAmount(goal_id, user_id);
    }
}
