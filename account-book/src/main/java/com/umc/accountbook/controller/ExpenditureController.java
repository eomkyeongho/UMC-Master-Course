package com.umc.accountbook.controller;

import com.umc.accountbook.service.ExpenditureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequiredArgsConstructor
@RequestMapping("expenditure")
public class ExpenditureController {
    private final ExpenditureService expenditureService;
}
