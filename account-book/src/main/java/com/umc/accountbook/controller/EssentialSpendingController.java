package com.umc.accountbook.controller;

import com.umc.accountbook.domain.EssentialSpending;
import com.umc.accountbook.domain.Expenditure;
import com.umc.accountbook.service.EssentialSpendingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("essential-consumption")
public class EssentialSpendingController {
    private final EssentialSpendingService essentialSpendingService;
    private final HttpSession httpSession;


    @GetMapping("/essential-spending-list")
    public List<EssentialSpending> getEssentialSpending(@RequestParam int essential_spending_id, @RequestParam int goal_id) {
        String sessionEmail = (String) httpSession.getAttribute("email");
        if(sessionEmail == null){
            // 리다이렉트 못하나
            log.info("getEssential: 잘못된 접근");
        }
        List<EssentialSpending> essentialSpendingList = essentialSpendingService.getEssentialSpending(essential_spending_id,goal_id);
        log.info("getEssential: 성공");
        return essentialSpendingList;
    }

    @PostMapping("")
    public String createEssentialSpending(@RequestParam int goal_id, @RequestParam Long icon, @RequestParam String content, @RequestParam Long cost){
        essentialSpendingService.createEssentialSpending(goal_id, icon, content, cost);

        return "Essential Spending created";
    }
}
