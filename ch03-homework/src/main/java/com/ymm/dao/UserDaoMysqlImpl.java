package com.ymm.dao;

import com.ymm.beans.User;
import org.springframework.stereotype.Component;

/**
 * Created by slade on 2020/1/5.
 */
@Component("myUserDao")
public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void insertUser(User user) {
        System.out.println("mysql insert");
    }
}
