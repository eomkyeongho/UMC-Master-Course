package com.umc.accountbook.mapper;

import com.umc.accountbook.domain.Expenditure;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExpenditureMapper {
    void createDailyExpenditure(Expenditure expenditure);
    List<Expenditure> getExpenditures(int history_id);
}
