package com.saihou.service.impl;

import com.saihou.dao.UserDao;
import com.saihou.factory.BeanFactory;
import com.saihou.service.UserService;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/15 22:05
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = (UserDao) BeanFactory.getBean("userDao");

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
