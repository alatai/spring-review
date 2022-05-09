package com.saihou.controller;

import com.saihou.entity.Account;
import com.saihou.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/16 21:55
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String username) {
        System.out.println("username-" + username);

        return "success";
    }

    /**
     * 请求参数绑定到JavaBean的类中
     */
    @RequestMapping("/save")
    public String testSave(Account account) {
        System.out.println(account);

        return "success";
    }

    /**
     * 自定义类型转换器问题
     */
    @RequestMapping("/user/save")
    public String testSaveUser(User user) {
        System.out.println(user);

        return "success";
    }

    /**
     * 获取原生API
     */
    @RequestMapping("/servlet")
    public String testServlet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println(req);

        HttpSession session = req.getSession();
        System.out.println(session);

        ServletContext ctx = session.getServletContext();
        System.out.println(ctx);

        System.out.println(resp);

        return "success";
    }
}
