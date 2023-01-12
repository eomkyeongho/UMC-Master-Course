package com.umc.accountbook.controller;

import com.umc.accountbook.service.GoalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("goal")
public class GoalController {
    private final GoalService goalService;
}
