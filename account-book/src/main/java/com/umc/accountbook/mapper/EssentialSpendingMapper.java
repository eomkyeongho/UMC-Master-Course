package com.umc.accountbook.mapper;

import com.umc.accountbook.domain.EssentialSpending;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EssentialSpendingMapper {

    EssentialSpending getEssentialSpending(int es_id);
}
