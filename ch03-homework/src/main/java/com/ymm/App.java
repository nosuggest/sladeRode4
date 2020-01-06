package com.ymm;

import com.ymm.beans.User;
import com.ymm.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        UserService userService = (UserService) ctx.getBean("myUserService");
        userService.addUser(new User());
    }
}
