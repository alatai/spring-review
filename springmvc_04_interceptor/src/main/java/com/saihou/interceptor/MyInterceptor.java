package com.saihou.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 *
 * @author Alatai
 * @version 1.0
 * @date 2021/04/17 17:29
 */
public class MyInterceptor implements HandlerInterceptor {

    /**
     * 预处理，controller方法执行前
     * return true 放行，执行下一个方法，如果没有，执行controller中的方法
     * return false 不放行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入拦截器");

        return true;
    }
}
