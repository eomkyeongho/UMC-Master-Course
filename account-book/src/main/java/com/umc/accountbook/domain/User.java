package com.umc.accountbook.domain;

import com.umc.accountbook.role.Role;
import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter @Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String nickname;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    public User update(String nickname) {
        this.nickname = nickname;

        return this;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }
}
