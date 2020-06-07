package com.tg.dao.impl;

import com.tg.dao.UserDao;
import com.tg.domain.User;
import com.tg.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Description: UserDaoImpl
 * @Author: tanggang
 * @Date: 2020/6/3
 * @Version: 1.0
 */
public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<User>(User.class));
    }

    @Override
    public User login(User loginUser) {
        try {
            String sql = "SELECT username, password FROM user WHERE username = ? AND password = ?";
            return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUsername(), loginUser.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addUser(User user) {
        String sql = "INSERT INTO user(name, gender, age, address, tel, email) VALUES(?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getGender(), user.getAge(),
                user.getAddress(), user.getTel(), user.getEmail());
    }

    @Override
    public void deleteUser(int id) {
        String sql = "DELETE FROM user WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public User findUserById(int id) {
        String sql = "SELECT * FROM user WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<User>(User.class), id);
    }

    @Override
    public void updateUser(User updateUser) {
        String sql = "UPDATE user SET name = ?, gender = ?, age = ?, address = ?, tel = ?, email = ? WHERE id = ?";
        jdbcTemplate.update(sql, updateUser.getName(), updateUser.getGender(), updateUser.getAge(),
                updateUser.getAddress(), updateUser.getTel(), updateUser.getEmail(), updateUser.getId());
    }

    @Override
    public int findTotalCount(Map<String, String[]> condition) {
        String sql = "SELECT COUNT(*) FROM user WHERE 1 = 1 ";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(sql);
        List<Object> params = new ArrayList<>();
        for (String key : condition.keySet()) {
            if("currentPage".equals(key) || "rows".equals(key)) {
                continue;
            }
            String value = condition.get(key)[0];
            if(!ObjectUtils.isEmpty(value)) {
                stringBuilder.append(" and " + key + " like ? ");
                params.add("%" + value + "%");
            }
        }
        return jdbcTemplate.queryForObject(stringBuilder.toString(), Integer.class, params.toArray());
    }

    @Override
    public List<User> findByPage(int start, int rows, Map<String, String[]> condition) {
        String sql = "SELECT * FROM user WHERE 1 = 1";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(sql);
        List<Object> params = new ArrayList<>();
        for (String key : condition.keySet()) {
            if("currentPage".equals(key) || "rows".equals(key)) {
                continue;
            }
            String value = condition.get(key)[0];
            if(!ObjectUtils.isEmpty(value)) {
                stringBuilder.append(" and " + key + " like ? ");
                params.add("%" + value + "%");
            }
        }
        stringBuilder.append(" LIMIT ? , ?");
        System.out.println(stringBuilder);
        params.add(start);
        params.add(rows);
        return jdbcTemplate.query(stringBuilder.toString(),
                new BeanPropertyRowMapper<User>(User.class), params.toArray());
    }
}
