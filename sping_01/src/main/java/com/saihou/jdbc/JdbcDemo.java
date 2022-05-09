package com.saihou.jdbc;

import java.sql.*;

/**
 * 程序耦合
 *
 * @author Alatai
 * @version 1.0
 * @date 2021/04/15 21:44
 */
public class JdbcDemo {

    public static void main(String[] args) throws SQLException {
        // 1.注册驱动
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        // 2.获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
        // 3.获取操作数据库的预处理对象
        PreparedStatement pstm = conn.prepareStatement("select * from user");
        // 4.执行SQL，得到结果集
        ResultSet rs = pstm.executeQuery();
        // 5.遍历结果集
        while (rs.next()) {
            System.out.println(rs.getString("username"));
        }
        // 6.释放资源
        rs.close();
        pstm.close();
        conn.close();
    }
}
