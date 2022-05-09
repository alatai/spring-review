package com.saihou.controller;

import com.saihou.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/16 23:55
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"}) // 把msg=咖啡存入到session域对象中
public class AnnoController {

    /**
     * 使用RequestParam注解，解决参数传参与实体属性命名不一致问题
     */
    @RequestMapping("/param")
    public String testRequestParam(@RequestParam("name") String username) {
        System.out.println("/anno/param");
        System.out.println(username);
        return "success";
    }

    /**
     * 使用RequestBody注解获取到请求体的内容
     */
    @RequestMapping("/body")
    public String testRequestBody(@RequestBody String requestBody) {
        System.out.println(requestBody);

        return "success";
    }

    /**
     * 使用PathVariable注解绑定url中的占位符
     * 利于restful风格
     */
    @RequestMapping("/path/{sid}")
    public String testPathVariable(@PathVariable("sid") String id) {
        System.out.println("/anno/path");
        System.out.println(id);

        return "success";
    }

    /**
     * 使用RequestHeader注解获取请求头
     */
    @RequestMapping("/header")
    public String testRequestHeader(@RequestHeader("Accept") String header) {
        System.out.println("/anno/header");
        System.out.println(header);

        return "success";
    }

    /**
     * 使用CookieValue注解获取cookie值
     */
    @RequestMapping("/cookie")
    public String testCookieValue(@CookieValue("JSESSIONID") String cookieValue) {
        System.out.println("/anno/cookie");
        System.out.println(cookieValue);

        return "success";
    }

    /**
     * 使用ModelAttribute注解，用于修饰方法和参数
     * 出现在参数上，获取指定的数据给参数赋值
     */
    @RequestMapping("/model")
    public String testModelAttribute(@ModelAttribute("abc") User user) {
        System.out.println("/anno/model");
        System.out.println(user);

        return "success";
    }

    /**
     * 使用ModelAttribute注解，用于修饰方法和参数
     * 出现在方法上，表示当前方法会在控制器的方法之前执行
     */
    @ModelAttribute
    public void before(String name, Map<String, User> map) {
        System.out.println("before...");

        // 通过用户查询数据库（模拟)
        User user = new User();
        user.setName(name);
        user.setAge(20);
        user.setDate(new Date());
        map.put("abc", user);

        // return user;
    }

    /**
     * 使用SessionAttributes注解，只能加到类上
     */
    @RequestMapping("/session")
    public String testSessionAttributes(Model model) {
        System.out.println("/anno/session");
        // 底层会存储到request域对象
        model.addAttribute("msg", "咖啡");

        return "success";
    }

    /**
     * 从session域取值
     */
    @RequestMapping("/getAttr")
    public String testGetSessionAttributes(ModelMap modelmap) {
        System.out.println("/anno/getAttr");
        // 底层会存储到request域对象
        String value = (String) modelmap.getAttribute("msg");
        System.out.println(value);

        return "success";
    }

    /**
     * 从session域清除
     */
    @RequestMapping("/delAttr")
    public String testDelSessionAttributes(SessionStatus status) {
        System.out.println("/anno/delAttr");
        status.setComplete();

        return "success";
    }
}
