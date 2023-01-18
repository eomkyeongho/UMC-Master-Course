package com.umc.accountbook.mapper;

import com.umc.accountbook.domain.DailyConsumption;
import com.umc.accountbook.domain.Expenditure;
import com.umc.accountbook.domain.EssentialSpending;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DailyConsumptionMapper {
    void checkTodaySuccess (DailyConsumption dailyConsumption);
    List<DailyConsumption> getTodaySuccess(String user_id, String date);

    DailyConsumption getDailyConsumption(String user_id, String date);
}
