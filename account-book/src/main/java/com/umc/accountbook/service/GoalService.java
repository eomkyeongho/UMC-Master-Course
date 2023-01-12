package com.umc.accountbook.service;

import com.umc.accountbook.mapper.GoalMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoalService {
    private final GoalMapper goalMapper;
}
