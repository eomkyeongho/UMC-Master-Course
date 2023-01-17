package com.umc.accountbook.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DailyConsumption {
    private int dc_id;
    private long user_id;
    private Long avail_spending;
    private Long spending;
    private Date date;
}
