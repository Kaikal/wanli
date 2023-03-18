package com.ynu.wanli.core.Config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        Object userNameId = session.getAttribute("userNameId");
        Object adminId = session.getAttribute("adminId");
        System.out.println("登录拦截器被调用！");
        if (userNameId==null&&adminId==null){
            String basePath=request.getScheme() +"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
            response.sendRedirect(basePath+"/user/index");
            return false;
        }
        return true;
    }
}