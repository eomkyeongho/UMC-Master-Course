package com.umc.accountbook.service;

import com.umc.accountbook.mapper.GoalMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoalService {
    private final GoalMapper goalMapper;

    public Long getRestAmount(int user_id, long goal_id) {
        return goalMapper.getRestAmount(user_id, goal_id);
    }
}
