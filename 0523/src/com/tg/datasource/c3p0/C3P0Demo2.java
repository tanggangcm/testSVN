package com.tg.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Description: C3P0Demo2
 * @Author: tanggang
 * @Date: 2020/5/24
 * @Version: 1.0
 */
public class C3P0Demo2 {
    public static void main(String[] args) throws SQLException {
        DataSource ds = new ComboPooledDataSource();
        for (int i = 1; i <= 11; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i + ":" + conn);

            if(i == 5) {
                conn.close();
            }
        }
    }
}
