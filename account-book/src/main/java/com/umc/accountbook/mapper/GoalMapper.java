package com.umc.accountbook.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoalMapper {
    long getRestAmount(int user_id, long goal_id);
}
