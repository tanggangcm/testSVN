package com.tg.jdbc;

import com.tg.domain.Emp;
import com.tg.util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: JDBCTest
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/23
 * @Version: 1.0
 */
public class JDBCTest {
    public static void main(String[] args) {
        List<Emp> all = findAll1();
        for (Emp emp : all) {
            System.out.println(emp);
        }
    }

    private static List<Emp> findAll1() {
        String sql = "SELECT * FROM emp";
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        List<Emp> empList = null;
        try {
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);

            empList = new ArrayList<>();
            Emp emp = null;
            while (rs.next()) {
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                emp = new Emp(id, ename, job_id, mgr, joindate, salary, bonus, dept_id);
                empList.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs, statement, connection);
        }

        return empList;
    }

    private static List<Emp> findAll() {
        String sql = "SELECT * FROM emp";
        List<Emp> empList = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql:///db3?serverTimezone=GMT",
                "root", "123456");
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(sql)) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Emp emp = null;
            while(rs.next()) {
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                emp = new Emp(id, ename, job_id, mgr, joindate, salary, bonus, dept_id);
                empList.add(emp);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return empList;
    }
}
