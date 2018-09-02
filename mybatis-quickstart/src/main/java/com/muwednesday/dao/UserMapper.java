package com.muwednesday.dao;

import com.muwednesday.model.User;

import java.util.List;

/**
 * Description:
 *
 * @author Xinwen
 * @date 2018/9/2
 */
public interface UserMapper {
    void insertUser(User user);
    User getUserById(Integer id);
    List<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(Integer id);
}
