package com.umc.accountbook.controller;

import com.umc.accountbook.service.DailyConsumptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("daily-consumption")
public class DailyConsumptionController {
    private final DailyConsumptionService dailyConsumptionService;

    @GetMapping ("/check")
    public ResponseEntity<String> checkTodaySuccess(@RequestParam String date){
        return ResponseEntity.ok(date);
    }


}
