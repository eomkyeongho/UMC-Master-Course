package com.umc.accountbook.controller;

import com.umc.accountbook.domain.EssentialSpending;
import com.umc.accountbook.domain.Expenditure;
import com.umc.accountbook.domain.Goal;
import com.umc.accountbook.dto.SessionUser;
import com.umc.accountbook.service.GoalService;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
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
        SessionUser user_id = (SessionUser) httpSession.getAttribute("user_id");
        System.out.println("user_id = " + user_id);
        goalService.createGoal(goal);

        return "Goal is created";
    }

    @GetMapping("/daily-avail-amount")
    public Long getDailyAvailAmount(@RequestParam int goal_id) {
        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        return goalService.getDailyAvailAmount(goal_id, user.getUser_id());
    }

    @GetMapping("recent")
    public Goal getRecentGoal() {
        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        return goalService.getRecentGoal(user.getUser_id());
    }
    
    @GetMapping("/rest-amount")
    public Long getRestAmount(@RequestParam int goal_id) {
        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        return goalService.getRestAmount(user.getUser_id(), goal_id);
    }

    @GetMapping("/progress-bar")
    public Map<String, Object> getProgressBar() {
        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        return goalService.getProgressBar(user.getUser_id());
    }
}
//일자, 내 사용자 id-> 하루 목표 - 하루 소비 < 0 실패