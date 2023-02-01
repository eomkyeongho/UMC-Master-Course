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
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("history")
public class HistoryController {
    private final HistoryService historyService;
    private final HttpSession httpSession;


    @GetMapping("/list")
    public List<Map<String, Object>> getHistoryList() {
        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        return historyService.getHistoryList(user.getUser_id());
    }
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
