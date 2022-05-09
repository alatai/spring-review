package com.saihou.test;

import com.saihou.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/16 14:29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springConfig.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testFindAll() {
        System.out.println(123);
    }
}
