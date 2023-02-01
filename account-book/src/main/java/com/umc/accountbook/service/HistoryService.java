package com.umc.accountbook.service;

import com.umc.accountbook.domain.History;
import com.umc.accountbook.mapper.HistoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class HistoryService {
    private final HistoryMapper historyMapper;

    public String getTodaySuccess(String id, String date) {
        if (historyMapper.getTodaySuccess(id, date).isEmpty())
        {
            return "true";
        } else {
            return "false";
        }
    }
    public History getHistory(int user_id, Date date){
        return historyMapper.getHistory(user_id, date);
    }

    public List<Map<String, Object>> getHistoryList(int user_id) {
        return historyMapper.getHistoryList(user_id);
    }
    public Long getSavingAmount(int user_id, Date date) {
        History history = historyMapper.getHistory(user_id, date);
        Long savingAmount = history.getDaily_avail_amount() - history.getSpending();

        return (savingAmount > 0 ? savingAmount : 0);
    }
}
