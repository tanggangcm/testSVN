package com.tg.service;

import com.tg.domain.PageBean;
import com.tg.domain.User;

import java.util.List;
import java.util.Map;

/**
 * @Description: UserService
 * @Author: tanggang
 * @Date: 2020/6/3
 * @Version: 1.0
 */
public interface UserService {
    List<User> finAll();

    User login(User loginUser);

    void addUser(User user);

    void deleteUser(int id);

    User findUserById(int id);

    void updateUser(User updateUser);

    void deleteUsers(String[] ids);

    PageBean<User> findUserByPage(String currentPage, String rows, Map<String, String[]> condition);
}
