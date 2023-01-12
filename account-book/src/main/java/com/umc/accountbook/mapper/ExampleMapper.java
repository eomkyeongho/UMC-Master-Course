package com.umc.accountbook.mapper;

import com.umc.accountbook.domain.EssentialSpending;
import com.umc.accountbook.domain.ExampleDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExampleMapper {

    ExampleDomain getExampleDomain(Long id);

    List<EssentialSpending> getEssentialSpendingList(int goal_id);
}
