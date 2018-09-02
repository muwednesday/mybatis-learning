package com.muwednesday.service;

import com.muwednesday.model.User;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Description:
 *
 * @author Xinwen
 * @date 2018/9/2
 */
public class UserServiceImplTest {

    @Test
    public void insertUser() {
        User user = new User();
        user.setUsername("Tom");
        user.setPassword("123456");
        user.setDate(new Date());
        user.setSex("M");
        user.setUnderlineTest("tom_test");
        UserService userService = new UserServiceImpl();
        userService.insertUser(user);
    }
}