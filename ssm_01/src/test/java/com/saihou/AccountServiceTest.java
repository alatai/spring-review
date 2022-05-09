package com.saihou;

import com.saihou.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/17 20:34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/applicationContext-core.xml"})
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindAll() {
        accountService.findAll();
    }
}
