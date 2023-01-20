package com.umc.accountbook.controller;

import com.umc.accountbook.domain.EssentialSpending;
import com.umc.accountbook.domain.Expenditure;
import com.umc.accountbook.dto.CreateEssentialSpendingRequestDto;
import com.umc.accountbook.service.EssentialSpendingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("essential-consumption")
public class EssentialSpendingController {
    private final EssentialSpendingService essentialSpendingService;

    @GetMapping("/{goal_id}")
    public List<EssentialSpending> getEssensialSpending(@PathVariable int goal_id) {
        List<EssentialSpending> essentialSpendingList = essentialSpendingService.getEssentialSpending(goal_id);

        return essentialSpendingList;
    }

    @PostMapping("/create")
    public void createEssentialSpending(@RequestBody CreateEssentialSpendingRequestDto requestDto){
        essentialSpendingService.createEssentialSpending(requestDto.getGoal_id(), requestDto.getIcon(), requestDto.getContent(), requestDto.getCost());
    }




}
