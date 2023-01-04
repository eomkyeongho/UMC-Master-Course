package com.umc.accountbook.service;

import com.umc.accountbook.domain.ExampleDomain;
import com.umc.accountbook.mapper.ExampleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExampleService {

    private final ExampleMapper testMapper;

    public ExampleDomain getExampleDomain(Long id) {
        return testMapper.getExampleDomain(id);
    }
}
