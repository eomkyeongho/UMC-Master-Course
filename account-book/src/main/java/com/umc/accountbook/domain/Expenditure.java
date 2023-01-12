package com.umc.accountbook.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Expenditure {
    private String content;
    private Long cost;
    private String memo;
}
