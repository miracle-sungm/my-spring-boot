package com.miracle.springframework.boot.service;

import com.miracle.springframework.boot.entity.User;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author : sungm
 * @date : 2021-03-16 16:54
 */
public interface UserService {

    User selectByUserId(Long userId);

    public List<User> selectByCreateTimeBetween(LocalDateTime startDateTime, LocalDateTime endDateTime);

}
