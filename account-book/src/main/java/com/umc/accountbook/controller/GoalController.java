package com.umc.accountbook.controller;

import com.umc.accountbook.domain.EssentialSpending;
import com.umc.accountbook.domain.Expenditure;
import com.umc.accountbook.domain.Goal;
import com.umc.accountbook.domain.User;
import com.umc.accountbook.service.GoalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
@RequestMapping("goal")
public class GoalController {
    private final GoalService goalService;

    private final HttpSession httpSession;

    @PostMapping("")
    public String createGoal(@RequestBody Goal goal) {
        goalService.createGoal(goal);

        return "Goal is created";
    }

    @GetMapping("/daily-avail-amount")
    public Long getDailyAvailAmount(@RequestParam int goal_id) {
        return goalService.getDailyAvailAmount(goal_id, 1);
    }

    @GetMapping("/recent")
    public Goal getRecentGoal() {
        User sessionUser = (User)httpSession.getAttribute("User");
        return goalService.getRecentGoal(1);
    }
    
    @GetMapping("/rest-amount")
    public Long getRestAmount(@RequestParam int goal_id) {
        return goalService.getRestAmount(1, goal_id);
    }

    @GetMapping("/progress-bar")
    public Map<String, Object> getProgressBar() {
        return goalService.getProgressBar(1);
    }
}
//일자, 내 사용자 id-> 하루 목표 - 하루 소비 < 0 실패