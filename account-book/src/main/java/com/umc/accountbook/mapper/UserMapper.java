package com.umc.accountbook.mapper;

import com.umc.accountbook.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void createUser(User user);

    User findUserByEmail(String email);

    String isNoGoal(int user_id);
}
