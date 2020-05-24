package com.tg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @Description: JDBCDemo1
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/23
 * @Version: 1.0
 */
public class JDBCDemo1 {
    public static void main(String[] args) throws Exception {
        // Class.forName("com.mysql.cj.jdbc.Driver");
        // Connection conn = DriverManager.getConnection(
        //         "jdbc:mysql://localhost:3306/db3?serverTimezone=GMT",
        //         "root", "123456");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql:///db3?serverTimezone=GMT",
                "root", "123456");
        String sql = "UPDATE account SET balance = 1000 WHERE id = 1";
        Statement statement = conn.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println(i);
        statement.close();
        conn.close();
    }
}
