package com.tg.jdbctemplate;

import com.tg.datasource.utils.JDBCUtil;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Description: JDBCTemplateDemo1
 * @Author: tanggang
 * @Date: 2020/5/24
 * @Version: 1.0
 */
public class JDBCTemplateDemo1 {
    public static void main(String[] args) {
        demo01();
    }



    private static void demo01() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtil.getDataSource());
        String sql = "UPDATE account SET balance = 5000 WHERE id = ?";
        int update = jdbcTemplate.update(sql, 6);
        System.out.println(update);
    }
}
