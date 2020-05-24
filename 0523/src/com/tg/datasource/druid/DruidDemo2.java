package com.tg.datasource.druid;

import com.tg.datasource.utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Description: DruidDemo
 * @Author: tanggang
 * @Date: 2020/5/24
 * @Version: 1.0
 */
public class DruidDemo2 {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        try {
            conn = JDBCUtil.getConnection();
            String sql = "INSERT INTO account VALUES (NULL, ?, ?)";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, "王五");
            preparedStatement.setDouble(2, 1000);
            int i = preparedStatement.executeUpdate();
            System.out.println(i);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(preparedStatement, conn);
        }
    }
}
