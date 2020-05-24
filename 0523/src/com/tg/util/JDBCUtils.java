package com.tg.util;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @Description: JDBCUtils
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/23
 * @Version: 1.0
 */
public class JDBCUtils {

    private static String url;
    private static String username;
    private static String password;
    private static String driver;

    static {
        try {
            Properties properties = new Properties();

            properties.load(JDBCUtils.class.getClassLoader()
                    .getResourceAsStream("jdbc.properties"));
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            driver = properties.getProperty("driver");

            Class.forName(driver);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * @Author tanggang@xiangzhitech.com
     * @Description // 获取连接
     * @Date 2020/5/23
     * @Param []
     * @return java.sql.Connection
     */
    public static Connection getConnection() throws SQLException {
       return DriverManager.getConnection(url, username, password);
    }

    /**
     * @Author tanggang@xiangzhitech.com
     * @Description // 释放资源
     * @Date 2020/5/23
     * @Param [statement, conn]
     * @return void
     */
    public static void close(Statement statement, Connection conn) {
        if(statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        if(conn !=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @Author tanggang@xiangzhitech.com
     * @Description // 释放资源
     * @Date 2020/5/23
     * @Param [rs, statement, conn]
     * @return void
     */
    public static void close(ResultSet rs, Statement statement, Connection conn) {
        if(rs != null) {
            try {
                rs.close();
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

        if(conn !=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
