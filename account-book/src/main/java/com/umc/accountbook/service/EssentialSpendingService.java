package com.umc.accountbook.service;

import com.umc.accountbook.domain.EssentialSpending;
import com.umc.accountbook.domain.Expenditure;
import com.umc.accountbook.dto.CreateEssentialSpendingRequestDto;
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

    public void createEssentialSpending(int goal_id, Long icon, String content, Long cost){
        essentialSpendingMapper.createEssentialSpending(goal_id, icon, content, cost);
    }

}
