package com.umc.accountbook.service;

import com.umc.accountbook.mapper.DailyConsumptionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DailyConsumptionService {
    private final DailyConsumptionMapper dailyConsumptionMapper;
}
