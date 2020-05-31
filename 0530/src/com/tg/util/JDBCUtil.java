package com.tg.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Description: JDBCUtil   JDBC工具类 使用Druid连接池
 * @Author: tanggang
 * @Date: 2020/5/30
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @Author tanggang
     * @Description //TODO 获取连接池对象
     * @Date 2020/5/30
     * @Param []
     * @return javax.sql.DataSource
     */
    public static DataSource getDataSource() {
        return ds;
    }

    /**
     * @Author tanggang
     * @Description //TODO 获取连接池对象
     * @Date 2020/5/30
     * @Param []
     * @return java.sql.Connection
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
