package com.saihou.dao.impl;

import com.saihou.dao.AccountDao;
import org.springframework.stereotype.Repository;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/16 17:53
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Override
    public void findAll() {
        System.out.println("查询所有...");
    }
}
