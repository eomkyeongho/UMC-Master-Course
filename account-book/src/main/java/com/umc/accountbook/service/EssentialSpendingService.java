package com.umc.accountbook.service;

import com.umc.accountbook.domain.EssentialSpending;
import com.umc.accountbook.domain.Expenditure;
import com.umc.accountbook.mapper.EssentialSpendingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EssentialSpendingService {

    private final EssentialSpendingMapper essentialSpendingMapper;

    public List<EssentialSpending> getEssentialSpending(int goal_id) {
        return essentialSpendingMapper.getEssentialSpending(goal_id);
    }

}
