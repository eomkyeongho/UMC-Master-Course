package com.umc.accountbook.mapper;

import com.umc.accountbook.domain.DailyConsumption;
import com.umc.accountbook.domain.Expenditure;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DailyConsumptionMapper {
    void checkTodaySuccess (DailyConsumption dailyConsumption);
    List<DailyConsumption> getDailyConsumption(int user_id);

}
