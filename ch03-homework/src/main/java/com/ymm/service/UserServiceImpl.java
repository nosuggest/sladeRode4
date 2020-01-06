package com.ymm.service;

import com.ymm.beans.User;
import com.ymm.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by slade on 2020/1/5.
 */

@Component("myUserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void addUser(User user) {
        userDao.insertUser(user);
    }
}
