package com.umc.accountbook.controller;

import com.umc.accountbook.domain.History;
import com.umc.accountbook.domain.User;
import com.umc.accountbook.service.HistoryService;
import com.umc.accountbook.service.UserService;
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
    private final UserService userService;
    private final HttpSession httpSession;


    @GetMapping ("/check")
    public ResponseEntity<String> getTodaySuccess(@RequestParam String id, @RequestParam String date){
        return ResponseEntity.ok(historyService.getTodaySuccess(id, date));
    }
    //http://url/check?id=1&date=2023-01-01

    //   history/{user_id}?date=2023-01-19로 Get 테스트 완료 했습니다!
    @GetMapping("/")
    public History getHistory(@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date date){
        String sessionEmail = (String) httpSession.getAttribute("email");
        User sessionUser = userService.findUserByEmail(sessionEmail);
        //test용
        History history = historyService.getHistory(sessionUser.getUserId(), date);
        return history;
    }

    @GetMapping("/saving-amount/{user_id}")
    public Long getSavingAmount(@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date date){
        String sessionEmail = (String) httpSession.getAttribute("email");
        User sessionUser = userService.findUserByEmail(sessionEmail);
        Long savingAmount = historyService.getSavingAmount(sessionUser.getUserId(),date);

        return savingAmount;
    }

    @GetMapping("/list")
    public List<Map<String, Object>> getHistoryList(){
        String email = (String) httpSession.getAttribute("email");
        User user = userService.findUserByEmail(email);
        return historyService.getHistoryList(user.getUser_id());
    }
}
