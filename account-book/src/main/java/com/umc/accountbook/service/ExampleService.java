package com.umc.accountbook.service;

import com.umc.accountbook.domain.EssentialSpending;
import com.umc.accountbook.domain.ExampleDomain;
import com.umc.accountbook.mapper.ExampleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExampleService {

    private final ExampleMapper testMapper;

    // 메소드
    public ExampleDomain getExampleDomain(Long id) {
        return testMapper.getExampleDomain(id);
    }

    public EssentialSpending getEssentialSpending(int es_id){
        return testMapper.getEssentialSpending(es_id);
        // 서비스에서 매퍼로
        // 이제 매퍼에 메소드 구현
    }
}
