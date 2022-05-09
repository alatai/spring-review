package com.saihou.test;

import com.saihou.service.AccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/16 16:18
 */
public class AOPTest {

    public static void main(String[] args) {
        // 获取容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
        // 获取对象
        AccountService accountService = (AccountService) ctx.getBean("accountService");
        // 执行方法
        accountService.save();
        accountService.update(1);
        accountService.delete();
    }
}
