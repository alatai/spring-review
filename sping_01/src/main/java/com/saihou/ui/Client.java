package com.saihou.ui;

import com.saihou.factory.BeanFactory;
import com.saihou.service.UserService;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/15 22:11
 */
public class Client {

    public static void main(String[] args) {
        UserService userService = (UserService) BeanFactory.getBean("userService");
        userService.saveUser();
    }
}
