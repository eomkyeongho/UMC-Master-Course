package com.umc.accountbook.service;

import com.umc.accountbook.domain.Expenditure;
import com.umc.accountbook.mapper.ExpenditureMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenditureService {
    private final ExpenditureMapper expenditureMapper;

    public List<Expenditure> getDailyConsumptionList(int dc_id) {
        return expenditureMapper.getDailyConsumptionList(dc_id);
    }
}
