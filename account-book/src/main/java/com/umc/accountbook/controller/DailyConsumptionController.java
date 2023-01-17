package com.umc.accountbook.controller;

import com.umc.accountbook.domain.DailyConsumption;
import com.umc.accountbook.domain.EssentialSpending;
import com.umc.accountbook.service.DailyConsumptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequiredArgsConstructor
@RequestMapping("daily-consumption")
public class DailyConsumptionController {

    private final DailyConsumptionService dailyConsumptionService;

    @GetMapping ("/check")
    public ResponseEntity<String> checkTodaySuccess(@RequestParam String date){
        return ResponseEntity.ok(date);
    }
    
    @GetMapping("daily-consumption/{user_id}")
    public DailyConsumption getDailyConsumption(@PathVariable long user_id){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        //test용
        DailyConsumption dailyConsumption = dailyConsumptionService.getDailyConsumption(String.valueOf(user_id), "2023-01-01");
        //DailyConsumption dailyConsumption = dailyConsumptionService.getDailyConsumption(String.valueOf(user_id), formatter.format(date));
        return dailyConsumption;
    }
}
