package com.miracle.springframework.boot.controller;

import com.miracle.springframework.boot.entity.User;
import com.miracle.springframework.boot.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author : sungm
 * @date : 2021-03-16 16:56
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping(value = "/getUser")
    public User getUser(Long userId) {
        return userService.selectByUserId(userId);
    }

    @GetMapping(value = "/getUsersByCreateTimeBetween")
    public List<User> getUser(@Param(value = "startDateTime") LocalDateTime startDateTime
            , @Param(value = "endDateTime") LocalDateTime endDateTime) {
        return userService.selectByCreateTimeBetween(startDateTime, endDateTime);
    }
}
