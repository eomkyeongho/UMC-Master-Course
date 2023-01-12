package com.umc.accountbook.service;

import com.umc.accountbook.mapper.ExpenditureMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExpenditureService {
    private final ExpenditureMapper expenditureMapper;
}
