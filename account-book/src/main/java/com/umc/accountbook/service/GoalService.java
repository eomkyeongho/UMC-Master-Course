package com.umc.accountbook.service;

import com.umc.accountbook.domain.Goal;
import com.umc.accountbook.mapper.GoalMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoalService {
    private final GoalMapper goalMapper;

    public void createGoal(Goal goal) {
        goalMapper.createGoal(goal);
    }

    public Long getDailyAvailAmount(int goal_id, int user_id) {
        return goalMapper.getDailyAvailAmount(goal_id, user_id);
    }
    public Long getRestAmount(int goal_id, int user_id) {
        return goalMapper.getRestAmount(goal_id, user_id);
    }
}
