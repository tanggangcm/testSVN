package com.tg.service.impl;

import com.tg.dao.UserDao;
import com.tg.dao.impl.UserDaoImpl;
import com.tg.domain.PageBean;
import com.tg.domain.User;
import com.tg.service.UserService;

import java.util.List;
import java.util.Map;

/**
 * @Description: UserServiceImpl
 * @Author: tanggang
 * @Date: 2020/6/3
 * @Version: 1.0
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public List<User> finAll() {
        return userDao.findAll();
    }

    @Override
    public User login(User loginUser) {
        return userDao.login(loginUser);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    @Override
    public void updateUser(User updateUser) {
        userDao.updateUser(updateUser);
    }

    @Override
    public void deleteUsers(String[] ids) {
        if(ids != null && ids.length > 0) {
            for (String id : ids) {
                userDao.deleteUser(Integer.parseInt(id));
            }
        }
    }

    @Override
    public PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition) {
        int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);
        PageBean<User> pageBean = new PageBean<>();
        pageBean.setCurrentPage(currentPage);
        pageBean.setRows(rows);
        int totalCount = userDao.findTotalCount(condition);
        pageBean.setTotalCount(totalCount);
        int start = (currentPage - 1) * rows;
        List<User> userList = userDao.findByPage(start, rows, condition);
        pageBean.setList(userList);
        int totalPage = totalCount % rows == 0 ? totalCount / rows : totalCount / rows + 1;
        pageBean.setTotalPage(totalPage);
        return pageBean;
    }
}
