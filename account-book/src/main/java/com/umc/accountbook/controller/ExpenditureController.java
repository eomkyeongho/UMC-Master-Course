package com.umc.accountbook.controller;

import com.umc.accountbook.domain.Expenditure;
import com.umc.accountbook.service.ExpenditureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
@RequestMapping("expenditure")
public class ExpenditureController {
    private final ExpenditureService expenditureService;

    @GetMapping("/dailyComsumption/{dc_id}")
    public List<Expenditure> getDailyConsumptionList(int dc_id) {
        return expenditureService.getDailyConsumptionList(dc_id);
    }
}
