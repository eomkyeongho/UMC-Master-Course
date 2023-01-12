package com.umc.accountbook.controller;

import com.umc.accountbook.domain.Expenditure;
import com.umc.accountbook.service.ExpenditureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
//@RequestMapping("expenditure")
public class ExpenditureController {
    private final ExpenditureService expenditureService;

    @GetMapping("/dailyComsumption/{dc_id}")
    public List<Expenditure> getDailyConsumptionList(@PathVariable int dc_id) {
        List<Expenditure> dailyConsumptionList = expenditureService.getDailyConsumptionList(dc_id);

        return dailyConsumptionList;
    }

    @GetMapping("/example")
    public String example1() {
        return "This is example";
    }
}
