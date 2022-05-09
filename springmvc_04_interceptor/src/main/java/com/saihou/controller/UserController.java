package com.saihou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/17 17:25
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testInterceptor")
    public String testInterceptor() {
        return "success";
    }

    @ModelAttribute
    public void before(HttpServletRequest request) {
        System.out.println(request.getServletPath());
    }
}
