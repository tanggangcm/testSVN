package com.tg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Description: JDBCUpdate
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/23
 * @Version: 1.0
 */
public class JDBCUpdate {
    public static void main(String[] args) {
        try(Connection conn = DriverManager
                .getConnection("jdbc:mysql:///db3?serverTimezone=GMT",
                        "root", "123456");
            Statement statement = conn.createStatement();) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql = "UPDATE account SET balance = 1000";

            int i = statement.executeUpdate(sql);
            System.out.println(i);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
