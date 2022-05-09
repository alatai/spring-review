package com.saihou.controller;

import com.saihou.exceptioin.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/17 17:01
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("testException")
    public String testException() throws SysException {
        try {
            // 模拟异常
            int ret = 10 / 0;
        } catch (Exception exp) {
            throw new SysException("出现错误...");
        }

        return "success";
    }

    @ModelAttribute
    public void before(HttpServletRequest request) {
        System.out.println(request.getServletPath());
    }
}
