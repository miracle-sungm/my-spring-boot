package com.miracle.springframework.boot.mapper;

import com.miracle.springframework.boot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author : sungm
 * @date : 2021-03-16 16:53
 */
@Mapper
@Repository
public interface UserMapper {

    User selectByUserId(@Param(value = "userId") Long userId);

    @Select("select * from base_user where create_time between #{startDateTime} and #{endDateTime}")
    List<User> selectByCreateTimeBetween(@Param(value = "startDateTime")LocalDateTime startDateTime
            , @Param(value = "endDateTime")LocalDateTime endDateTime);

}
