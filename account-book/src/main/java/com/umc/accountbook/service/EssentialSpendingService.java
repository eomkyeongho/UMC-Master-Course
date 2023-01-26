package com.umc.accountbook.service;

import com.umc.accountbook.domain.EssentialSpending;
import com.umc.accountbook.mapper.EssentialSpendingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EssentialSpendingService {

    private final EssentialSpendingMapper essentialSpendingMapper;

    public List<EssentialSpending> getEssentialSpending(int essential_spending_id,int goal_id) {
        return essentialSpendingMapper.getEssentialSpending(essential_spending_id,goal_id);
    }

    public void createEssentialSpending(EssentialSpending essentialSpending){
        essentialSpendingMapper.createEssentialSpending(essentialSpending);
    }

}
