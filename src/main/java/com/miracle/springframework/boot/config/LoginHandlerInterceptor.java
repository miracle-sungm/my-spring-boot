package com.miracle.springframework.boot.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * 登陆拦截器
 *
 * @author : sungm
 * @date : 2021-03-16 14:56
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("user");
        if (Objects.isNull(user)) {
            response.getWriter().write("请登录");
            return false;
        }
        return true;
    }
}
