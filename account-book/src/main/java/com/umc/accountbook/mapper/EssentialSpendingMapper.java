package com.umc.accountbook.mapper;

import com.umc.accountbook.domain.EssentialSpending;
import com.umc.accountbook.domain.Expenditure;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EssentialSpendingMapper {
    List<EssentialSpending> getEssentialSpending(int essential_spending_id, int goal_id);
}
