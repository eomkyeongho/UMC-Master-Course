package com.umc.accountbook.mapper;

import com.umc.accountbook.domain.EssentialSpending;
import com.umc.accountbook.domain.ExampleDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExampleMapper {

    ExampleDomain getExampleDomain(Long id);
    EssentialSpending getEssentialSpending(int es_id);
    //이제 db에서 가져와야 함
}
