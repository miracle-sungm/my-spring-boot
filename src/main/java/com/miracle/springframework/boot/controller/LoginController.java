package com.miracle.springframework.boot.controller;

import com.miracle.springframework.boot.common.ResultDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : sungm
 * @date : 2021-03-16 14:53
 */
@Controller
public class LoginController {

    @ResponseBody
    @RequestMapping(value = "/login")
    public ResultDTO login(@RequestParam(value = "username") String username
            , @RequestParam(value = "password")  String password, HttpServletRequest request) {
        if ("admin".equals(String.valueOf(username)) && "admin".equals(String.valueOf(password))) {
            request.getSession().setAttribute("user", "admin");
            return ResultDTO.of("success");
        }
        return ResultDTO.of("failure", "用户名或密码错误");
    }

    @ResponseBody
    @RequestMapping(value = "/logout")
    public ResultDTO logout(HttpServletRequest request) {
        request.getSession().removeAttribute("user");
        request.getSession().invalidate();
        return ResultDTO.of("failure", "用户名或密码错误");
    }

    @ResponseBody
    @GetMapping(value = "/test")
    public ResultDTO test() {
        return ResultDTO.of();
    }

}
