package com.saihou.service.impl;

import com.saihou.dao.AccountDao;
import com.saihou.dao.impl.AccountDaoImpl;
import com.saihou.service.AccountService;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/16 17:54
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDaoImpl accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String source, String target, Float money) {
        accountDao.findAll();
    }
}
