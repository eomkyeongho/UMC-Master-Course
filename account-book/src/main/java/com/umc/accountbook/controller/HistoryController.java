package com.umc.accountbook.controller;

import com.umc.accountbook.domain.History;
import com.umc.accountbook.service.HistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequiredArgsConstructor
@RequestMapping("history")
public class HistoryController {
    private final HistoryService historyService;

    @GetMapping ("/check")
    public ResponseEntity<String> checkTodaySuccess(@RequestParam String date){
        return ResponseEntity.ok(date);
    }

    //   history/{user_id}?date=2023-01-19로 Get 테스트 완료 했습니다!
    @GetMapping("/{user_id}")
    public History getDailyConsumption(@PathVariable int user_id, @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date date){
        //test용
        History history = historyService.getHistory(user_id, date);
        //DailyConsumption dailyConsumption = dailyConsumptionService.getDailyConsumption(String.valueOf(user_id), formatter.format(date));
        return history;
    }

    @GetMapping("/saving-amount/{user_id}")
    public Long getSavingAmount(@PathVariable int user_id, @RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date date){
        Long savingAmount = historyService.getSavingAmount(user_id,date);

        return savingAmount;
    }
}
