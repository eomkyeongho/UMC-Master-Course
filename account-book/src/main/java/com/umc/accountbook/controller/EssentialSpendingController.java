package com.umc.accountbook.controller;

import com.umc.accountbook.domain.EssentialSpending;
import com.umc.accountbook.service.EssentialSpendingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("essential-spending")
public class EssentialSpendingController {
    private final EssentialSpendingService essentialSpendingService;
    private final HttpSession httpSession;


    @GetMapping("/essential-spending-list")
    public List<EssentialSpending> getEssentialSpending(@RequestParam int essential_spending_id, @RequestParam int goal_id) {
        List<EssentialSpending> essentialSpendingList = essentialSpendingService.getEssentialSpending(essential_spending_id,goal_id);

        return essentialSpendingList;
    }

    @PostMapping("/create")
    public void createEssentialSpending(@RequestBody EssentialSpending essentialSpending){
        essentialSpendingService.createEssentialSpending(essentialSpending);
    }
}
