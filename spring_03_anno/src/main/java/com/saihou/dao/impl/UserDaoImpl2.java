package com.saihou.dao.impl;

import com.saihou.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/15 22:06
 */
@Repository("userDao2")
public class UserDaoImpl2 implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("保存账户222");
    }
}
