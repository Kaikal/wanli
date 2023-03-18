package com.ynu.wanli.core.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    //2.重写addInterceptors方法
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //3. 注册自定义编写的拦截器
        // 调用addInterceptor，参数传递拦截器实例
        InterceptorRegistration ic = registry.addInterceptor(new LoginInterceptor());
        //设置拦截器的拦截规则
        ic.addPathPatterns("/**");
        //放行拦截器（登录页面、登录请求、静态资源（js、css、img、video、font（字体文件））、阿里druid连接池监控中心、swaggerui）
        ic.excludePathPatterns(
                "/register.html",
                "/admin/doLogin",
                "/user/login",
                "/user/index",
                "/js/**",
                "/css/**",
                "/car/**",
                "/docs/**",
                "/driver/**",
                "/font/**",
                "/fonts/**",
                "/order/**",
                "/plugins/**",
                "/user/**",
                "/user_user/**",
                "/img/**",
                "/druid/**",
                "/swagger-ui.html",
                "/v2/**",
                "/webjars/**",
                "/swagger-resources/**");
    }
}