package com.miracle.springframework.boot.entity;

import lombok.*;

import java.time.LocalDateTime;

/**
 * @author : sungm
 * @date : 2021-03-16 16:51
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long userId;
    private String userName;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String remarks;

}
