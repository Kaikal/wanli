package com.ynu.wanli.core.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 模块名称：
 * 模块类型：
 * 编码人：刘彬
 * 生成时间：2023/3/4
 * 联系电话：
 * */
@Controller
public class PageController {

    @GetMapping("/toAdmin")
    public String toAdmin(){

        return "index_admin";
    }
    @GetMapping("/toLogin")
    public String toLogin(){

        return "login";
    }
}
