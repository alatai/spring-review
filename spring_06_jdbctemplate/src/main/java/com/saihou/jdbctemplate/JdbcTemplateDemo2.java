package com.saihou.jdbctemplate;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/16 17:15
 */
public class JdbcTemplateDemo2 {

    public static void main(String[] args) {
        // 获取容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
        // 获取对象
        JdbcTemplate jt = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        // 执行操作
        jt.execute("insert into account(uid, money) values(9, 2000)");
    }
}
