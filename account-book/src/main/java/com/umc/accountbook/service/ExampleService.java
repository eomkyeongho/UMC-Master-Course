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

    public ExampleDomain getExampleDomain(Long id) {
        return testMapper.getExampleDomain(id);
    }

    public List<EssentialSpending> getEssentialSpendingList(int goal_id) {
        return testMapper.getEssentialSpendingList(goal_id);
    }
}
