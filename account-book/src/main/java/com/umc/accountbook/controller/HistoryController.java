package com.umc.accountbook.controller;

import com.umc.accountbook.domain.History;
import com.umc.accountbook.dto.SessionUser;
import com.umc.accountbook.service.HistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequiredArgsConstructor
@RequestMapping("history")
public class HistoryController {
    private final HistoryService historyService;
    private final HttpSession httpSession;


    @GetMapping ("/check")
    public ResponseEntity<String> getTodaySuccess(@RequestParam String id, @RequestParam String date){
        return ResponseEntity.ok(historyService.getTodaySuccess(id, date));
    }

    @GetMapping("")
    public History getHistory(@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date date){
        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        return historyService.getHistory(user.getUser_id(), date);

    }

    @GetMapping("/saving-amount")
    public Long getSavingAmount(@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date date){
        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        return historyService.getSavingAmount(user.getUser_id(),date);
    }


}
