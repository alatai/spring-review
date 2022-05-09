package com.saihou.service.impl;

import com.saihou.dao.AccountDao;
import com.saihou.dao.impl.AccountDaoImpl;
import com.saihou.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/16 17:54
 */
@Service("accountService")
@Transactional(propagation = Propagation.REQUIRED, readOnly = true) // 3.在需要的业务处添加注解
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer(String source, String target, Float money) {
        accountDao.findAll();
    }
}
