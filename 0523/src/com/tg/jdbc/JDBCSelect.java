package com.tg.jdbc;

import java.sql.*;

/**
 * @Description: JDBCInsert
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/23
 * @Version: 1.0
 */
public class JDBCSelect {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql:///db3?serverTimezone=GMT",
                    "root", "123456");
            statement = conn.createStatement();

            String sql = "SELECT * FROM account";
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double balance = resultSet.getDouble("balance");
                System.out.println(id + " : " + name + " : " + balance);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
