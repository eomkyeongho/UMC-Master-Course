package com.umc.accountbook.mapper;

import com.umc.accountbook.domain.History;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface HistoryMapper {
    History getHistory(@Param("user_id") int user_id, @Param("date") Date date);

    void checkTodaySuccess (History history);
    List<History> getHistory(int user_id);
}
