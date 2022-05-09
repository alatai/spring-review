package com.saihou.dao.impl;

import com.saihou.dao.UserDao;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/15 22:06
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("保存账户");
    }
}
