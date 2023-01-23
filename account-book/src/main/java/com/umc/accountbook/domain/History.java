package com.umc.accountbook.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class History {
    private int history_id;
    private int user_id;
    private Long max_avail_amount;
    private Long daily_avail_amount;
    private Long spending;
    private Date date;
}


