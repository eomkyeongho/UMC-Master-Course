package com.umc.accountbook.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Expenditure {
    private int exp_id;
    private int dc_id;
    private Long icon;
    private String content;
    private Long cost;
    private String memo;
}
