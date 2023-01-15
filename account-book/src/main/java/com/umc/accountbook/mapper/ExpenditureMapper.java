package com.umc.accountbook.mapper;

import com.umc.accountbook.domain.Expenditure;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExpenditureMapper {
    List<Expenditure> getDailyConsumptionList(int dc_id);

    void createDailyExpenditure(Expenditure expenditure);
}
