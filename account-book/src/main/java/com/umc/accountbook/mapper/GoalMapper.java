package com.umc.accountbook.mapper;

import com.umc.accountbook.domain.Goal;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface GoalMapper {
    void createGoal(Goal goal);
    long getDailyAvailAmount(int goal_id, int user_id);
    long getRestAmount(int user_id, int goal_id);

    Map<String, Object> getProgressBar(int user_id);
}
