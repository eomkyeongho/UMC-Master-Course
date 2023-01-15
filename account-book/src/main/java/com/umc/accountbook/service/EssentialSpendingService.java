package com.umc.accountbook.service;

import com.umc.accountbook.domain.EssentialSpending;
import com.umc.accountbook.mapper.EssentialSpendingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EssentialSpendingService {
    private final EssentialSpendingMapper essentialSpendingMapper;

    public EssentialSpending getEssentialSpending(int es_id) {
        return essentialSpendingMapper.getEssentialSpending(es_id);
    }
}
