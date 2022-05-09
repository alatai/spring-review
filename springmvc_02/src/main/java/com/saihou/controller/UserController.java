package com.saihou.controller;

import com.saihou.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/17 10:58
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 返回值为String
     */
    @RequestMapping("/testString")
    public String testString(Model model) {
        // 模拟从数据中查询出User对象
        User user = new User();
        user.setName("开发");
        user.setPassword("abc");
        user.setAge(27);

        // model对象存数据
        model.addAttribute("user", user);

        return "success";
    }

    /**
     * 返回值为void
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) {
        try {
            // 请求转发，请求转发一次请求，不用编写项目的名称
            // 手动写转发，不会再经过视图解析器
            // request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);

            // 重定向（相当于发起一次新的请求）
            // response.sendRedirect(request.getContextPath() + "/index.jsp");

            // 直接进行响应
            // 设置字符编码，解决乱码问题
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");

            response.getWriter().print("你好！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 返回值为ModelAndView对象
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        // 模拟从数据中查询出User对象
        User user = new User();
        user.setName("Java开发");
        user.setPassword("abc");
        user.setAge(27);

        ModelAndView mv = new ModelAndView();
        // 把user对象存储到mv对象中，底层也会把user对象存入到request对象
        mv.addObject("user", user);

        // 跳转页面（经过视图解析器）
        mv.setViewName("success");

        return mv;
    }

    /**
     * 使用forward或redirect
     */
    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect() {
        // 请求转发
        // return "forward:/WEB-INF/pages/success.jsp";

        // 重定向
        return "redirect:/index.jsp";
    }

    /**
     * 模拟异步请求、响应
     * Jackson自动封装到JavaBean
     */
    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user) {
        // 客户端发送ajax的请求，传的是json字符串，后端把json字符串封装到User对象
        System.out.println(user);
        // 做响应，模拟查询数据库
        user.setName("胖子");
        user.setAge(40);

        return user;
    }

    /**
     * 在所有方法之前执行
     */
    @ModelAttribute
    public void before(HttpServletRequest request) {
        System.out.println(request.getServletPath());
    }

}
