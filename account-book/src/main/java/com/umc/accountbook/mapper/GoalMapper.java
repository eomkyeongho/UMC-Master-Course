package com.umc.accountbook.mapper;

import com.umc.accountbook.domain.Goal;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoalMapper {

    void createGoal(Goal goal);
    long getDailyAvailAmount(int goal_id, int user_id);
    long getRestAmount(int goal_id, int user_id);
}
