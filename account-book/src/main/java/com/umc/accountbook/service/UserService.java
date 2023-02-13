package com.umc.accountbook.service;

import com.umc.accountbook.domain.User;
import com.umc.accountbook.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Collections;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    public void createUser(User user) {
        userMapper.createUser(user);
    }

    public User findUserByEmail(String email) {
        return userMapper.findUserByEmail(email);
    }

    public String isNoGoal(int user_id) {
        if (userMapper.isNoGoal(user_id) == null) {
            return "no goal"
        }
        return "exist";
    }
}
