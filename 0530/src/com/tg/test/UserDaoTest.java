package com.tg.test;

import com.tg.dao.UserDao;
import com.tg.domain.User;
import org.junit.Test;

/**
 * @Description: UserDaoTest
 * @Author: tanggang
 * @Date: 2020/5/30
 * @Version: 1.0
 */
public class UserDaoTest {
    @Test
    public void loginTest() {
        User user = new User("zhangsan", "123");
        UserDao userDao = new UserDao();
        User login = userDao.login(user);
        System.out.println(login);
    }
}
