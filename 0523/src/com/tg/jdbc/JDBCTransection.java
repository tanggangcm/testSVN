package com.tg.jdbc;

import com.tg.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Description: JDBCTransection
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/23
 * @Version: 1.0
 */
public class JDBCTransection {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        try {
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            String sql1 = "UPDATE account SET balance = balance - ? WHERE id = ?";
            String sql2 = "UPDATE account SET balance = balance + ? WHERE id = ?";

            preparedStatement1 = conn.prepareStatement(sql1);
            preparedStatement2 = conn.prepareStatement(sql2);
            preparedStatement1.setDouble(1, 500);
            preparedStatement1.setInt(2, 1);
            preparedStatement2.setDouble(1, 500);
            preparedStatement2.setInt(2, 2);

            int i = preparedStatement1.executeUpdate();

            int a = 1/0;

            int i1 = preparedStatement2.executeUpdate();
            System.out.println(i);
            System.out.println(i1);
            conn.commit();
        } catch (Exception e) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JDBCUtils.close(preparedStatement1, conn);
            JDBCUtils.close(preparedStatement2, null);
        }
    }
}
