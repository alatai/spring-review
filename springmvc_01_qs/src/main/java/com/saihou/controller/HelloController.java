package com.saihou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 控制器
 * 1.启动服务器，加载一些配置文件
 * DispatcherServlet对象创建
 * springMVC.xml被加载
 * HelloController被创建（单例的)
 * 2.发送请求，后台处理请求
 *
 * @author Alatai
 * @version 1.0
 * @date 2021/04/16 20:52
 */
@Controller
@RequestMapping(path = "/user")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello() {
        System.out.println("Hello SpringMVC");

        return "success";
    }

    /**
     * RequestMapping注解
     * 属性
     * value；用于指定请求的URL，它和path属性的作用是一样的
     * method：用于指定请求的方式
     * params：用于指定限制请求参数的条件。它支持简单的表达式，要求请求参数的key和value必须和配置的一样
     * header：用于指定限制请求消息头的条件
     */
    @RequestMapping(path = "/testRequestMapping", method = {RequestMethod.POST, RequestMethod.GET})
    public String testRequestMapping() {
        System.out.println("测试RequestMapping注解...");

        return "success";
    }
}