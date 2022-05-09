package com.saihou.service.impl;

import com.saihou.service.UserService;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/15 22:05
 */
public class UserServiceImpl implements UserService {

    @Override
    public void saveUser() {
    }

    public void init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
