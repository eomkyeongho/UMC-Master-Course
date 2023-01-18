package com.umc.accountbook.mapper;

import com.umc.accountbook.domain.History;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

@Mapper
public interface HistoryMapper {
    public History getHistory(@Param("user_id") int user_id, @Param("date") Date date);
}
