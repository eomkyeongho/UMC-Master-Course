package com.umc.accountbook.domain;
import lombok.*;

@Getter
@Setter
public class User {
    private int user_id;
    private String email;
    private String name;

    public int getUserId() {
        return user_id;
    }
}
