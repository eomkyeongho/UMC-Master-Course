package com.umc.accountbook.mapper;

import com.umc.accountbook.domain.ExampleDomain;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExampleMapper {

    ExampleDomain getExampleDomain(Long id);
}
