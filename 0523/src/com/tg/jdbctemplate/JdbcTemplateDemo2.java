package com.tg.jdbctemplate;

import com.tg.datasource.utils.JDBCUtil;
import com.tg.domain.Emp;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Description: JdbcTemplateDemo2
 * @Author: tanggang
 * @Date: 2020/5/24
 * @Version: 1.0
 */
public class JdbcTemplateDemo2 {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtil.getDataSource());
    @Test
    public void test1() {
        String sql = "UPDATE emp SET salary = ? WHERE id = ?";
        int update = jdbcTemplate.update(sql, 10000, 1001);
        Assert.assertEquals(update, 1);
    }

    @Test
    public void test2() {
        String sql = "INSERT INTO emp(id, ename, dept_id) VALUES(?, ?,?)";
        int update = jdbcTemplate.update(sql, 1015, "郭靖", 10);
        Assert.assertEquals(update, 1);
    }

    @Test
    public void test3() {
        String sql = "DELETE FROM emp WHERE id = ?";
        int update = jdbcTemplate.update(sql, 1015);
        Assert.assertEquals(update, 1);
    }

    @Test
    public void test4() {
        String sql = "SELECT * FROM emp WHERE id = ?";
        // queryForMap() 查询的结果只能有一条
        Map<String, Object> map = jdbcTemplate.queryForMap(sql, 1002);
        System.out.println(map);
    }

    @Test
    public void test05() {
        String sql = "SELECT * FROM emp";
        // 将每一条记录装map中，再将这些map装在List中
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        System.out.println(maps);
    }

    @Test
    public void test6() {
        String sql = "SELECT * FROM emp";
        List<Emp> empList = jdbcTemplate.query(sql, (rs, i) -> {
            Integer id = rs.getInt("id");
            String ename = rs.getString("ename");
            Integer job_id = rs.getInt("job_id");
            Integer mgr = rs.getInt("mgr");
            Date joindate = rs.getDate("joindate");
            Double salary = rs.getDouble("salary");
            Double bonus = rs.getDouble("bonus");
            Integer dept_id = rs.getInt("dept_id");
            Emp emp = new Emp(id, ename, job_id, mgr, joindate, salary, bonus, dept_id);
            return emp;
        });

        for (Emp emp : empList) {
            System.out.println(emp);
        }
    }

    @Test
    public void test6_2() {
        String sql = "SELECT * FROM emp";
        List<Emp> empList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));

        for (Emp emp : empList) {
            System.out.println(emp);
        }
    }

    @Test
    public void test7() {
        String sql = "SELECT COUNT(id) FROM emp";
        Long total = jdbcTemplate.queryForObject(sql, Long.class);
        System.out.println(total);
    }
}
