package com.tg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Description: JDBCInsert
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/23
 * @Version: 1.0
 */
public class JDBCInsert {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql:///db3?serverTimezone=GMT",
                    "root", "123456");
            statement = conn.createStatement();

            String sql = "INSERT INTO account VALUES(null, '王五', 1000)";
            int i = statement.executeUpdate(sql);
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
