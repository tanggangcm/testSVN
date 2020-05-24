package com.tg.datasource.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;

/**
 * @Description: DruidDemo
 * @Author: tanggang
 * @Date: 2020/5/24
 * @Version: 1.0
 */
public class DruidDemo {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(DruidDemo.class.getClassLoader()
                .getResourceAsStream("druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}
