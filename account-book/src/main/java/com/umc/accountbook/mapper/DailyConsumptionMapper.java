package com.umc.accountbook.mapper;

import com.umc.accountbook.domain.DailyConsumption;
import com.umc.accountbook.domain.EssentialSpending;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DailyConsumptionMapper {
    DailyConsumption getDailyConsumption(String user_id, String date);
}
