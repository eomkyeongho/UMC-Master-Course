package com.umc.accountbook.mapper;

import com.umc.accountbook.domain.DailyConsumption;
import com.umc.accountbook.domain.EssentialSpending;
import com.umc.accountbook.domain.Expenditure;
import com.umc.accountbook.dto.CreateEssentialSpendingRequestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EssentialSpendingMapper {
    List<EssentialSpending> getEssentialSpending(int goal_id);
    void createEssentialSpending (int goal_id, Long icon, String content, Long cost);
}
