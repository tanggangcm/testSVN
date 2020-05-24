package com.tg.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Description: C3P0Demo1
 * @Author: tanggang
 * @Date: 2020/5/23
 * @Version: 1.0
 */
public class C3P0Demo1 {
    public static void main(String[] args) throws SQLException {
        DataSource ds = new ComboPooledDataSource();

        Connection conn = ds.getConnection();

        System.out.println(conn);
    }
}
