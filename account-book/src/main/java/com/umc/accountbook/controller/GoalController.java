package com.umc.accountbook.controller;

import com.umc.accountbook.domain.EssentialSpending;
import com.umc.accountbook.domain.Expenditure;
import com.umc.accountbook.domain.Goal;
import com.umc.accountbook.domain.User;
import com.umc.accountbook.service.GoalService;
import com.umc.accountbook.service.UserService;
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
    private final UserService userService;
    private final HttpSession httpSession;

    @PostMapping("")
    public String createGoal(@RequestBody Goal goal) {
        String sessionEmail = (String) httpSession.getAttribute("email");
        User sessionUser = userService.findUserByEmail(sessionEmail);
        goal.setUser_id(sessionUser.getUserId());
        goalService.createGoal(goal);

        return "Goal is created";
    }

    @GetMapping("/daily-avail-amount")
    public Long getDailyAvailAmount(@RequestParam int goal_id) {
        String sessionEmail = (String) httpSession.getAttribute("email");
        User sessionUser = userService.findUserByEmail(sessionEmail);
        return goalService.getDailyAvailAmount(goal_id, sessionUser.getUserId());
    }

    @GetMapping("/recent")
    public Goal getRecentGoal() {
        String sessionEmail = (String) httpSession.getAttribute("email");
        User sessionUser = userService.findUserByEmail(sessionEmail);
        return goalService.getRecentGoal(sessionUser.getUserId());
    }
    
    @GetMapping("/rest-amount")
    public Long getRestAmount(@RequestParam int goal_id) {
        String sessionEmail = (String) httpSession.getAttribute("email");
        User sessionUser = userService.findUserByEmail(sessionEmail);
        return goalService.getRestAmount(sessionUser.getUserId(), goal_id);
    }

    @GetMapping("/progress-bar")
    public Map<String, Object> getProgressBar() {
        String sessionEmail = (String) httpSession.getAttribute("email");

        if(sessionEmail == null) {
            // error 로그인이 되어있지 않습니다.
        }
        User user = userService.findUserByEmail(sessionEmail);
        return goalService.getProgressBar(user.getUserId());
    }
}
//일자, 내 사용자 id-> 하루 목표 - 하루 소비 < 0 실패