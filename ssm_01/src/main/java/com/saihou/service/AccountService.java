package com.saihou.service;

import com.saihou.entity.Account;

import java.util.List;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/17 20:22
 */
public interface AccountService {

    List<Account> findAll();

    // void save(Account account);
}
