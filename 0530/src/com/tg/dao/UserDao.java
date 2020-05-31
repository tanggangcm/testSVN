package com.tg.dao;

import com.tg.domain.User;
import com.tg.util.JDBCUtil;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Description: UserDao
 * @Author: tanggang
 * @Date: 2020/5/30
 * @Version: 1.0
 */
public class UserDao {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtil.getDataSource());
    /**
     * @Author tanggang
     * @Description //TODO 登录方法
     * @Date 2020/5/30
     * @Param [loginUser]
     * @return com.tg.domain.User
     */
    public User login(User loginUser) {
        try {
            String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
            User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUsername(), loginUser.getPassword());
            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
