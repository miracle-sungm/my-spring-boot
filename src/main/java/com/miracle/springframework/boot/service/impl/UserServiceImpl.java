package com.miracle.springframework.boot.service.impl;

import com.miracle.springframework.boot.entity.User;
import com.miracle.springframework.boot.mapper.UserMapper;
import com.miracle.springframework.boot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author : sungm
 * @date : 2021-03-16 16:55
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User selectByUserId(Long userId) {
        return userMapper.selectByUserId(userId);
    }

    @Override
    public List<User> selectByCreateTimeBetween(LocalDateTime startDateTime, LocalDateTime endDateTime) {
        return userMapper.selectByCreateTimeBetween(startDateTime, endDateTime);
    }
}
