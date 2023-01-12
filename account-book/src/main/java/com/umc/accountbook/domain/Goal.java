package com.umc.accountbook.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Goal {
    private int goal_id;
    private int user_id;
    private Long icon;
    private Long target_amount;
    private Date period_start;
    private Date period_end;
    private String memo;
    private Long monthly_income;
    private Long daily_avail_spending;
    private Long rest_money;
}
