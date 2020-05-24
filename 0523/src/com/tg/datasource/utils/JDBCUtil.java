package com.tg.datasource.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @Description: Druid连接池的工具类
 * @Author: tanggang
 * @Date: 2020/5/24
 * @Version: 1.0
 */
public class JDBCUtil {
    private static DataSource ds;
    static {
        try {
            Properties properties = new Properties();
            properties.load(JDBCUtil.class.getClassLoader()
                    .getResourceAsStream("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * @Author tanggang
     * @Description // 获取连接
     * @Date 2020/5/24
     * @Param []
     * @return java.sql.Connection
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    /**
     * @Author tanggang
     * @Description // 释放资源
     * @Date 2020/5/24
     * @Param [statementm, connection]
     * @return void
     */
    public static void close(Statement statementm, Connection connection) {
        close(null, statementm, connection);
    }

    public static void close(ResultSet rs, Statement statementm, Connection connection) {
        if(rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(statementm != null) {
            try {
                statementm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(connection != null) {
            try {
                connection.close(); // 归还连接
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @Author tanggang
     * @Description // 获取连接池
     * @Date 2020/5/24
     * @Param []
     * @return javax.sql.DataSource
     */
    public static DataSource getDataSource() {
        return ds;
    }
}
