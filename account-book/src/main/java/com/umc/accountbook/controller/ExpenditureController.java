package com.umc.accountbook.controller;

import com.umc.accountbook.domain.Expenditure;
import com.umc.accountbook.service.ExpenditureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("expenditure")
public class ExpenditureController {
    private final ExpenditureService expenditureService;

    @GetMapping("/expenditures/{dc_id}")
    public List<Expenditure> getExpenditures(@PathVariable int dc_id) {
        List<Expenditure> expenditureList = expenditureService.getExpenditures(dc_id);

        return expenditureList;
    }

    @PostMapping("")
    public String createDailyExpenditure(@RequestBody Expenditure expenditure) {
        expenditureService.createDailyExpenditure(expenditure);

        return "Daily expenditure is created";
    }
}
