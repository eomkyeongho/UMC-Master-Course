package com.umc.accountbook.mapper;

import com.umc.accountbook.domain.History;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Mapper
public interface HistoryMapper {
    History getHistory(@Param("user_id") int user_id, @Param("date") Date date);

    void getTodaySuccess (History history);
    List<History> getHistory(int user_id);
    List<History> getTodaySuccess(String user_id, String date);
    List<Map<String, Object>> getHistoryList(int user_id);
}
