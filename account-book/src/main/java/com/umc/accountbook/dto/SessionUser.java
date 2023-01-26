package com.umc.accountbook.dto;

import com.umc.accountbook.domain.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    SessionUser() {}

    public SessionUser(User user) {
        this.nickname = user.getNickname();
        this.email = user.getEmail();
        this.user_id = user.getUser_id();
    }

    private int user_id;
    private String nickname;

    private String email;
}
