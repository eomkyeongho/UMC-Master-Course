package com.umc.accountbook.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// 도메인
public class EssentialSpending {
    // db값들을 이 객체에 넣을 거임
    // ExampleDomain 따라하기
    private int es_id;
    private int goal_id;
    private Long icon;
    private String content;
    private Long cost;
}
