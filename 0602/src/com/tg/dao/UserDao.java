package com.tg.dao;

import com.tg.domain.User;

import java.util.List;
import java.util.Map;

/**
 * @Description: UserDao
 * @Author: tanggang
 * @Date: 2020/6/3
 * @Version: 1.0
 */
public interface UserDao {
    List<User> findAll();

    User login(User loginUser);

    void addUser(User user);

    void deleteUser(int id);

    User findUserById(int id);

    void updateUser(User updateUser);

    int findTotalCount(Map<String, String[]> condition);

    List<User> findByPage(int start, int rows, Map<String, String[]> condition);
}
