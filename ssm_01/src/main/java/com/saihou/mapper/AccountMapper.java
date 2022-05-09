package com.saihou.mapper;

import com.saihou.entity.Account;

import java.util.List;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/17 20:21
 */
public interface AccountMapper {

    List<Account> findAll();

    void save(Account account);
}
