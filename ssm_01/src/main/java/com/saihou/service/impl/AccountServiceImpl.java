package com.saihou.service.impl;

import com.saihou.entity.Account;
import com.saihou.mapper.AccountMapper;
import com.saihou.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/17 20:23
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Override
    public List<Account> findAll() {
        System.out.println("findAll");
        return null;
    }

    // @Override
    // public void save(Account account) {
    //     System.out.println("save");
    // }
}
