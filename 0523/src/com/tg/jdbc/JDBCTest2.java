package com.tg.jdbc;

import com.tg.util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * @Description: JDBCTest2
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/23
 * @Version: 1.0
 */
public class JDBCTest2 {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scann.nextLine();
        System.out.println("请输入密码");
        String password = scann.nextLine();

        boolean login = new JDBCTest2().login(username, password);
        if(login) {
            System.out.println("登录成功");
        } else {
            System.out.println("用户名或密码错误");
        }
    }

    public boolean login2(String username, String password) {
        if (username != null && password != null) {
            Connection conn = null;
            PreparedStatement preparedStatement = null;
            ResultSet rs = null;
            String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
            try {
                conn = JDBCUtils.getConnection();
                preparedStatement = conn.prepareStatement(sql);

                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);

                rs = preparedStatement.executeQuery();
                return rs.next();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                JDBCUtils.close(rs, preparedStatement, conn);
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean login(String username, String password) {
        if (username != null && password != null) {
            Connection conn = null;
            Statement statement = null;
            ResultSet rs = null;
            String sql = "SELECT * FROM user WHERE username = '"
                    + username + "' AND password = '" + password + "'";
            try {
                conn = JDBCUtils.getConnection();
                statement = conn.createStatement();
                rs = statement.executeQuery(sql);
                return rs.next();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                JDBCUtils.close(rs, statement, conn);
            }
            return true;
        } else {
            return false;
        }
    }
}
