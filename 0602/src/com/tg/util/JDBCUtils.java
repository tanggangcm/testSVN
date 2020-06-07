package com.tg.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Description: JDBCUtils
 * @Author: tanggang
 * @Date: 2020/6/3
 * @Version: 1.0
 */
public class JDBCUtils {
    private static DataSource ds;

    static {
        try {
            Properties properties = new Properties();
            properties.load(JDBCUtils.class.getClassLoader()
                    .getResourceAsStream("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    public static DataSource getDataSource() {
        return ds;
    }
}
