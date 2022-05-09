package com.saihou.service.impl;

import com.saihou.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/16 15:55
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Override
    public void save() {
        System.out.println("保存...");
    }

    @Override
    public void update(int i) {
        System.out.println("更新...");
    }

    @Override
    public int delete() {
        System.out.println("删除...");
        return 0;
    }
}
