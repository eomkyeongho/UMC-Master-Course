package com.umc.accountbook.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoalMapper {
    long getDailyAvailAmount(int user_id, int goal_id);
    long getRestAmount(int user_id, int goal_id);
}
