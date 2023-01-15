package com.umc.accountbook.controller;

import com.umc.accountbook.domain.EssentialSpending;
import com.umc.accountbook.domain.ExampleDomain;
import com.umc.accountbook.service.ExampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ExampleController {
    private final ExampleService testService;

    @GetMapping("/example")
    public String example1() {
        return "This is example";
    }

    @GetMapping("/example/{id}")
    public ExampleDomain example2(@PathVariable Long id) {
        ExampleDomain exDomain = testService.getExampleDomain(id);
        return exDomain;
    }

    @GetMapping("testapi/{es_id}")
    // 아이디에 대한 EssentialSpending 반환하는 로직을 짜야함
    public EssentialSpending testAPI(@PathVariable int es_id){
        // 컨트롤러 다음에 서비스 호출
        EssentialSpending es = testService.getEssentialSpending(es_id);
        return es;
    }
}
