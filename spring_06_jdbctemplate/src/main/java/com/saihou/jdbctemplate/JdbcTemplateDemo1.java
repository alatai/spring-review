package com.saihou.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * JdbcTemplate 基本用法
 *
 * @author Alatai
 * @version 1.0
 * @date 2021/04/16 17:02
 */
public class JdbcTemplateDemo1 {

    public static void main(String[] args) {
        // 数据源，Spring内置数据源
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/test");
        ds.setUsername("root");
        ds.setPassword("admin");

        // 创建JdbcTemplate对象
        JdbcTemplate jt = new JdbcTemplate();
        jt.setDataSource(ds);
        // 执行操作
        jt.execute("insert into account(uid, money) values(8, 1000)");
    }
}
