package com.umc.accountbook.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoalMapper {
    long getDailyAvailAmount(int goal_id, int user_id);
    long getRestAmount(int goal_id, int user_id);
}
