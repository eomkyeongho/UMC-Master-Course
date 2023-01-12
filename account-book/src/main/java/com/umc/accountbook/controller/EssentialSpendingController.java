package com.umc.accountbook.controller;

import com.umc.accountbook.service.EssentialSpendingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequiredArgsConstructor
@RequestMapping("essential-consumption")
public class EssentialSpendingController {
    private final EssentialSpendingService essentialSpendingService;
}
