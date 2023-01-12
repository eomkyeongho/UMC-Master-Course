package com.umc.accountbook.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EssentialSpending {
    private int es_id;
    private int goal_id;
    private Long icon;
    private String content;
    private Long cost;
}
