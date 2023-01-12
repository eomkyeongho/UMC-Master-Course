package com.umc.accountbook.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int user_id;
    private String email;
    private String name;
    private String role;
}
