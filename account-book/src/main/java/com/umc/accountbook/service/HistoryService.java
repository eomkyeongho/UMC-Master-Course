package com.umc.accountbook.service;

import com.umc.accountbook.domain.History;
import com.umc.accountbook.mapper.HistoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class HistoryService {
    private final HistoryMapper historyMapper;


    //    public String checkTodaySuccess(Long userId, String date) {
//        return dailyConsumptionMapper.checkTodaySuccess(userId);
//        userId = 1L;
//        //userid랑 date를 줘서 objectmapper에서 sql문 실행하기 양수든 음수든 들어올 건데 양수면 true가 나올 것 -> 성공
//        //xml에다가 sql써서 필요한 인자만 던져주기..
//    }
    public History getHistory(int user_id, Date date){
        return historyMapper.getHistory(user_id, date);
    }
    public Long getSavingAmount(int user_id, Date date) {
        History history = historyMapper.getHistory(user_id, date);
        Long savingAmount = history.getDaily_avail_amount() - history.getSpending();

        return (savingAmount > 0 ? savingAmount : 0);
    }
}
